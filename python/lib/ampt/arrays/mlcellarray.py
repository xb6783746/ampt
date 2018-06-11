from ampt.arrays.mlresizeblearr import mlresizeblearr
from ampt.utils import *


class cellentry:

    def __init__(self, val):
        self.val = val

    def __str__(self) -> str:
        return str(self.val)

    def __repr__(self):
        return str(self.val)


class mlcellarray(mlresizeblearr):

    def __call__(self, *index):

        is_linear, index = self.build_indices(index)

        if is_linear:
            return mlcellarray(self.flatten(order="F")[index])

        return mlcellarray(self[np.ix_(*index)])

    def __setitem__(self, index, value):
        if not isinstance(index, tuple):
            index = (index,)

        if not isinstance(value, mlcellarray):
            value = cellentry(value)

        is_linear, index = self.build_indices(index)

        if is_linear:
            self.try_extend_linear(index)

            index = np.unravel_index(index, self.shape, order="F")
            self.array[index] = value
        else:
            self.try_extend(index)
            self.array[np.ix_(*index)] = value

    def cget(self, *index):
        is_linear, index = self.build_indices(index)

        if is_linear:
            res = self.flatten(order="F")[index]
        else:
            res = self[np.ix_(*index)]

        if isscalar(res):
            res = np.asscalar(res).val
        else:
            res = tuple(x.val for x in res)

        return res