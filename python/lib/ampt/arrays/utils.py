import numpy as np
from ampt.arrays.mlarr import mlarr
from ampt.arrays.mlcellarray import mlcellarray, cellentry


def mr(arg):
    if np.isscalar(arg):
        return arg

    return mlarr(np.block(arg))


def mc(arg):
    if np.isscalar(arg):
        return arg

    arg = [[cellentry(y) for y in row] for row in arg]
    return mlcellarray(arg, dtype=cellentry)


def rng(start, stop, step=1):
    add = 1 if step > 0 else -1

    return mlarr(np.arange(start, stop + add, step))