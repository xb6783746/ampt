import numpy as np
from ampt.core import *


def change_dimension(dim, arrDims):
    if dim == 1:
        return arrDims - 2
    if dim == 2:
        return arrDims - 1

    return arrDims - dim;


def ones(*dims):
    dims = rearrange_indices(dims)
    arr = np.ones(dims)
    return mlarr(arr)


def zeros(*dims):
    dims = rearrange_indices(dims)
    arr = np.zeros(dims)
    return mlarr(arr)

@ampt_function(2, False)
def max(a, b, nargin, nargout = 1):
    if b is None:
        return np.max(a)

    return np.maximum(a, b)


def all(arr, dim=1):

    if is_vector(arr):

        return np.all(arr)

    dim = change_dimension(dim, arr.ndim)

    return mlarr(np.all(arr, dim, keepdims=True))


def any(arr, dim=1):

    if is_vector(arr):

        return np.all(arr)

    dim = change_dimension(dim, arr.ndim)

    return mlarr(np.any(arr, dim, keepdims=True))


def disp(x):

    print(x)


def mean(arr):

    return np.mean(arr)


def sin(arr):

    return np.sin(arr)


def cos(arr):

    return np.cos(arr)


def asin(arr):

    return np.arcsin(arr)


def acos(arr):

    return np.arccos(arr)


def rand(*x):

    return mlarr(np.random.rand(*x))


def randn(*x):

    return mlarr(np.random.randn(*x))


def zeros(*x):

    return mlarr(np.zeros(x))


def sum(x):

    return np.sum(x)


@ampt_function(2, False)
def size(x, dim, nargin, nargout = 1):

    if np.isscalar(x):
        return (1, 1,)
    else:
        return x.shape[dim - 1] if dim is not None else x.shape


@ampt_function(1, False)
def ndims(x, nargin, nargout = 1):

    if np.isscalar(x):
        return 1
    else:
        return x.ndim


@ampt_function(1, False)
def isreal(x, nargin, nargout = 1):
    return np.isreal(x)


@ampt_function(1, False)
def fix(x, nargin, nargout = 1):
    res = np.fix(x)

    if isscalar(res):
        return np.asscalar(res)

    return mlarr(res)


@ampt_function(1, False)
def find(x, nargin, nargout = 1):

    res = np.argwhere(flat(x)) + 1

    return mlarr(res)


@ampt_function(1, False)
def isindex(x, nargin, nargout = 1):

    return np.all(x >= 1)


@ampt_function(1, False)
def rows(x, nargin, nargout = 1):

    return x.shape[0]


@ampt_function(1, False)
def columns(x, nargin, nargout = 1):

    return x.shape[1]


@ampt_function(2, False)
def permute(x, order, nargin, nargout = 1):

    res = np.moveaxis(x, np.arange(0, x.ndim), order.flatten(order="F") - 1)
    return mlarr(res)


@ampt_function(1, False)
def error(message, nargin, nargout = 1):

    raise Exception(message)


@ampt_function(0, False)
def print_usage(nargin, nargout = 1):

    print("print_usage not implemented")


@ampt_function(1, False)
def isempty(x, nargin, nargout = 1):
    return not isscalar(x) and x.size == 0


@ampt_function(1, False)
def length(x, nargin, nargout = 1):
    if isscalar(x):
        return 1

    return max(x.shape)


@ampt_function(1, False)
def numel(x, nargin, nargout=1):
    if isscalar(x):
        return 1

    return x.size


@ampt_function(1, False)
def issparse(x, nargin, nargout=1):
    return False


@ampt_function(2, False)
def kron(a, b, nargin, nargout=1):
    res = np.kron(a, b)
    return mlarr(res)

@ampt_function(2, False)
def prod(x, dim, nargin, nargout=1):
    if dim is None:
        dim = 1

    res = np.prod(x, axis=dim)
    return mlarr(res)


def cell(*dims):
    arr = np.empty(dims)
    return mc(arr)


def cellfun(funcname, arr):
    func = globals()[funcname]

    def wrapper(x):
        return func(x.val)

    vectorize = np.vectorize(wrapper)
    res = vectorize(arr)
    return mc(res)


def reshape(x, *dims):
    dims = rearrange_indices(dims)
    arr = np.reshape(np.ravel(x), dims, order="F").copy()
    return mlarr(arr)


def resize(x, dims):
    dims = rearrange_indices(dims)
    arr = x.resize(dims)
    return mlarr(arr)