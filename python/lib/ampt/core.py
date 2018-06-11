import numpy as np
from ampt.arrays.stub import *
from ampt.arrays.utils import *
from ampt.operators import *


class indexer:

    def __getitem__(self, item):
        if item.start is not None \
                and item.stop is not None:

            step = 1 if item.step is None else item.step
            add = 1 if step > 0 else -1

            return np.arange(item.start, item.stop + add, step)

        return item


rg = indexer()


def fix_tuple_count(args, count):
    if len(args) < count:
        args = args + tuple(None for i in range(0, count - len(args)))
    else:
        args = args[:count]

    return args


def fix_args_count(args, count, is_varargs):
    if not is_varargs:
        args = fix_tuple_count(args, count)
    elif len(args) < count + 1:
        args = fix_tuple_count(args, count + 1)

    return args


def create_varargs(varargs):
    return mc((varargs, ))


def ampt_function(pos_args_count, is_varargs):
    def decorator(fn):
        def wrapper(*args, nargout=1):

            nargin = len(args)
            args = fix_args_count(args, pos_args_count, is_varargs)

            if is_varargs:
                pos_args = args[:pos_args_count]
                varargs = create_varargs(args[pos_args_count:])
                args = pos_args + (varargs, )

            res = fn(*args, nargin=nargin, nargout=nargout)

            if nargout == 1:
                return res[0] if isinstance(res, tuple) else res

            return fix_tuple_count(res, nargout)

        return wrapper

    return decorator


def anonf(lmd):
    args = lmd.__code__.co_varnames[0:-2]

    isVarargs = args[-1] == "varargin"

    if isVarargs:
        args = args[0:-1]

    return ampt_function(len(args), isVarargs)(lmd)
