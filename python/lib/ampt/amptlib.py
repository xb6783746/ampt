import numpy as np
from ampt.core import mlarr


def is_vector(arr):

    return ~np.isscalar(arr) \
           and arr.ndim == 2 \
           and (arr.shape[0] == 1 or arr.shape[1] == 1)


def change_dimension(dim, arrDims):
    if dim == 1:
        return arrDims - 2
    if dim == 2:
        return arrDims - 1

    return arrDims - dim;


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
