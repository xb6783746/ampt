import numpy as np


def flat(x):
    return x if np.isscalar(x) else x.flatten(order="F")


def isscalar(x):
    return np.isscalar(x) or x.size == 1


class mlarr(np.lib.user_array.container):

    def sum(self, axis=None, dtype=None, out=None, keepdims=False):

        res = self.__array__().sum(axis=0)

        if not isscalar(res):
            res = mlarr(res)

        return res

    def __mul__(self, val):

        if isscalar(val):
            res = np.multiply(self, val)
        else:
            res = mlarr(self @ val)

        if res.size == 1:
            res = np.asscalar(res)

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

        index = self.build_indices(index)

        if len(index) == 1:
            return self.flatten(order="F")[index[0]]

        index = (flat(x) for x in index)
        return mlarr(self[np.ix_(*index)])

    # def __setitem__(self, index, value):
    #     super().__setitem__(index, value)

    def __setitem__(self, index, value):

        if not isinstance(index, tuple):
            index = (index, )

        index = self.build_indices(index);

        if len(index) == 1:

            index = np.unravel_index(index[0], self.shape, order="F")
            self.array[index] = value
        else:

            flatIndices = list(flat(x) for x in index)
            nShape = self.create_shape(flatIndices)

            if len(index) > self.ndim or nShape > self.shape:
                self.extend(nShape)

            self.array[np.ix_(*flatIndices)] = value;


    def build_indices(self, index):

        if len(index) > 1:
            index = list(reversed(index[2:])) + [index[0], index[1]]

            shape = self.shape

            if len(index) > self.ndim:
                shape = tuple(index[i] for i in range(0, len(index) - self.ndim)) + shape;

            for i in range(0, len(index)):
                index[i] = self.dec(index[i], shape[i]);

            return index;
        else:

            index = (self.dec(index[0], self.size),);

            return index;

    def dec(self, index, dimsize):

        if isinstance(index, slice):
            start = index.start - 1 if index.start != None else 0
            stop = index.stop if index.stop != None else dimsize
            step = index.step if index.step != None else 1

            return np.arange(start, stop, step);
        if np.isscalar(index):
            index = np.array([index]);

        return index - 1;

    def create_shape(self, flatIndices):

        m = tuple(max(flatIndices[i]) + 1 for i in range(0, len(flatIndices)))

        newDimsCount = len(flatIndices) - self.ndim;
        newDims = tuple(m[i] for i in range(0, newDimsCount))

        slc = m[newDimsCount:]

        oldDims = tuple(max(slc[i], self.shape[i]) for i in range(0, self.ndim))

        newShape = newDims + oldDims;
        return newShape;

    def extend(self, newShape):
        newDimsCount = len(newShape) - self.ndim
        ind = tuple(0 for i in range(0, newDimsCount)) + tuple([slice(0, n) for n in self.shape])
        newarr = np.zeros(newShape);
        newarr[ind] = self.array
        self.array = newarr


def dotmul(a, b):
    return np.multiply(a, b)


def dotdiv(a, b):
    return np.divide(a, b)


def dotpow(a, b):
    return np.power(a, b)


def mr(arg):
    if np.isscalar(arg):
        return arg

    return mlarr(np.block(arg))


def rg(start, stop, end=None):
    return mlarr(np.arange(start, stop + 1, end))


def ampt_function(pos_args_count, is_varargs):
    def decorator(fn):
        def wrapper(*args, nargout=1):

            nargin = len(args)

            args = args + tuple(None for i in range(0, pos_args_count - nargin))

            pos_args = args[:pos_args_count]

            if is_varargs:
                pos_args = pos_args + args[pos_args_count:]

            res = fn(*pos_args, nargin=nargin, nargout=nargout)

            if len(res) == 1:
                return res;

            if nargout == 1:
                return res[0]
            else:
                return res[:nargout]

        return wrapper;

    return decorator;


def anonf(lmd):
    args = lmd.__code__.co_varnames[0:-2]

    isVarargs = args[-1] == "varargin";

    if isVarargs:
        args = args[0:-1]

    return ampt_function(len(args), isVarargs)(lmd)