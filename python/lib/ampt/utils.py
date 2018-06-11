import numpy as np


class endexpression:
    pass


end = endexpression()


def flat(x):
    return x if np.isscalar(x) else x.flatten(order="F")


def isscalar(x):
    return np.isscalar(x) or x.size == 1


def is_vector(arr):
    return ~np.isscalar(arr) \
           and arr.ndim == 2 \
           and (arr.shape[0] == 1 or arr.shape[1] == 1)


def is_row_vector(arr):
    return arr.shape[0] == 1


def vector_size(arr):
    return arr.shape[0] if arr.shape[1] == 1 else arr.shape[1]


def rearrange_indices(index):
    if not np.isscalar(index) and len(index) > 2:
        index = list(reversed(index[2:])) + [index[0], index[1]]
    return index


def fix_slice(slc, start, stop):
    start = slc.start if slc.start is not None else start
    stop = slc.stop if slc.stop is not None else stop
    step = slc.step if slc.step is not None else 1

    return np.arange(start, stop + 1, step)


def flat_indices(indices, shape):
    if len(indices) > len(shape):
        shape = tuple(0 for i in range(0, len(indices) - len(shape))) + shape

    def replace_slice(elem, dimsize):
        if elem == ':':
            elem = slice(None)
        if isinstance(elem, endexpression):
            elem = dimsize

        if isinstance(elem, slice):
            return fix_slice(elem, 1, dimsize)
        else:
            return np.array([elem]) if np.isscalar(elem) else elem

    new_indices = [replace_slice(indices[i], shape[i]).flatten(order="F") for i in range(0, len(indices))]

    return new_indices


def build_indices(index, shape):
    if np.isscalar(index):
        return (index - 1,)

    index = rearrange_indices(index)
    index = flat_indices(index, shape)
    index = tuple(x.astype(int) - 1 for x in index)

    return index


def dims_greater(dim1, dim2):
    return len(dim1) > len(dim1) or dim1 > dim2