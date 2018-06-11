import numpy as np
from numpy.lib.user_array import *
from typing import Any


class caller:

    def __init__(self, mlarr, attr):
        self.mlarr = mlarr
        self.attr = attr

    def __call__(self, *args, **kwargs):
        attr = self.attr

        return self.mlarr.ndarr.__getattr__(attr)(*args, **kwargs)

class mlarrwrapper(np.ndarray):

    def __array_wrap__(self, out_arr, context=None):
        print('In __array_wrap__:')
        print('   self is %s' % repr(self))
        print('   arr is %s' % repr(out_arr))
        print('   context is %s' % repr(context))

        if out_arr.size == 1:

            return np.asscalar(out_arr)

        return mlarr(out_arr)

    def __array_ufunc__(self, *args, **kwargs):
        super().__array_ufunc__(*args, **kwargs)


class mlarr(int):

    def __init__(self, ndarr):

        self.ndarr = ndarr.view(mlarrwrapper)

    def __getattr__(self, item):

        return self.ndarr.__getattr__(item)

    def __add__(self, x: int) -> int:
        return self.ndarr.__add__(x)

    def __sub__(self, x: int) -> int:
        return self.ndarr.__sub__(x)

    def __mul__(self, x: int) -> int:
        return self.ndarr.__mul__(x)

    def __floordiv__(self, x: int) -> int:
        return self.ndarr.__floordiv__(x)

    def __truediv__(self, x: int) -> float:
        return self.ndarr.__truediv__(x)

    def __mod__(self, x: int) -> int:
        return self.ndarr.__mod__(x)

    def __radd__(self, x: int) -> int:
        return self.ndarr.__radd__(x)

    def __rsub__(self, x: int) -> int:
        return self.ndarr.__rsub__(x)

    def __rmul__(self, x: int) -> int:
        return self.ndarr.__rmul__(x)

    def __rfloordiv__(self, x: int) -> int:
        return self.ndarr.__rfloordiv__(x)

    def __rtruediv__(self, x: int) -> float:
        return self.ndarr.__rtruediv__(x)

    def __rmod__(self, x: int) -> int:
        return self.ndarr.__rmod__(x)

    def __pow__(self, x: int) -> Any:
        return self.ndarr.__pow__(x)

    def __rpow__(self, x: int) -> Any:
        return self.ndarr.__rpow__(x)

    def __and__(self, n: int) -> int:
        return self.ndarr.__and__(n)

    def __or__(self, n: int) -> int:
        return self.ndarr.__or__(n)

    def __xor__(self, n: int) -> int:
        return self.ndarr.__xor__(n)

    def __lshift__(self, n: int) -> int:
        return self.ndarr.__lshift__(n)

    def __rshift__(self, n: int) -> int:
        return self.ndarr.__rshift__(n)

    def __rand__(self, n: int) -> int:
        return self.ndarr.__rand__(n)

    def __ror__(self, n: int) -> int:
        return self.ndarr.__ror__(n)

    def __rxor__(self, n: int) -> int:
        return self.ndarr.__rxor__(n)

    def __rlshift__(self, n: int) -> int:
        return self.ndarr.__rlshift__(n)

    def __rrshift__(self, n: int) -> int:
        return self.ndarr.__rrshift__(n)

    def __neg__(self) -> int:
        return self.ndarr.__neg__()

    def __pos__(self) -> int:
        return self.ndarr.__pos__()

    def __invert__(self) -> int:
        return self.ndarr.__invert__()

    def __eq__(self, x: object) -> bool:
        return self.ndarr.__eq__(x)

    def __ne__(self, x: object) -> bool:
        return self.ndarr.__ne__(x)

    def __lt__(self, x: int) -> bool:
        return self.ndarr.__lt__(x)

    def __le__(self, x: int) -> bool:
        return self.ndarr.__le__(x)

    def __gt__(self, x: int) -> bool:
        return self.ndarr.__gt__(x)

    def __ge__(self, x: int) -> bool:
        return self.ndarr.__ge__(x)









