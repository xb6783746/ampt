from ampt.arrays.mlarr import *


def dotmul(a, b):
    return mlarr(np.multiply(a, b))


def dotdiv(a, b):
    return mlarr(np.divide(a, b))


def dotpow(a, b):
    return mlarr(np.power(a, b))


def transpose(a):
    return mlarr(a.T)


def ctranspose(a):
    return mlarr(a.H)


def mod(x, y):
    return x % y


def copy(val):
    return val
