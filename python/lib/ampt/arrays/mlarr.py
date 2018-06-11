from ampt.arrays.mlresizeblearr import mlresizeblearr
from ampt.utils import *


class mlarr(mlresizeblearr):

    def sum(self, axis=None, dtype=None, out=None, keepdims=False):

        res = self.__array__().sum(axis=0)

        if not isscalar(res):
            res = mlarr(res)

        return res

    def __mul__(self, val):

        if isscalar(val):
            res = np.multiply(self, val)
        else:
            res = self @ val

        if isscalar(res):
            res = np.asscalar(res)
        else:
            res = mlarr(res)

        return res

    def __rmul__(self, val):
        return self.__mul__(val)

    def __truediv__(self, val):
        if isscalar(val):
            return np.divide(self, val)

        return mlarr(np.linalg.lstsq(val.T, self.T)[0].T)

    def __rtruediv__(self, val):
        return self.__truediv__(val)

    def __pow__(self, val):
        return mlarr(np.linalg.matrix_power(self, val))

    def __rpow__(self, val):
        return mlarr(np.linalg.matrix_power(self, val))

    def __call__(self, *index):
        if len(index) == 1 and isinstance(index[0], tuple):
            index = index[0]

        is_linear, index = self.build_indices(index)

        if is_linear:
            res = mlarr(self.flatten(order="F")[index])
            if isscalar(res):
                return np.asscalar(res)
            return mlarr(res)

        return mlarr(self[np.ix_(*index)])

    def __setitem__(self, index, value):
        if not isinstance(index, tuple):
            index = (index,)

        is_linear, index = self.build_indices(index)

        if is_linear:
            self.try_extend_linear(index)

            index = np.unravel_index(index, self.shape, order="F")
            self.array[index] = value
        else:
            self.try_extend(index)
            self.array[np.ix_(*index)] = value
