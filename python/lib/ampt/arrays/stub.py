from ampt.arrays.mlarr import mlarr
from ampt.arrays.mlcellarray import mlcellarray
from ampt.arrays.utils import *


class stub:

    def __init__(self, val=None, inited=False):
        self.val = val
        self.inited = inited

    def __setitem__(self, index, value):

        if not self.inited:
            if isinstance(value, mlarr):
                self.val = mr([[0]])
            if isinstance(value, mlcellarray):
                self.val = mc([[0]])
            self.inited = True

        self.val.__setitem__(index, value)

    def __mul__(self, val):
        self.val.__mul__(val)

    def __rmul__(self, val):
        return self.val.__rmul__(val)

    def __truediv__(self, val):
        return self.val.__truediv__(val)

    def __rtruediv__(self, val):
        return self.val.__rtruediv__(val)

    def __pow__(self, val):
        return self.val.__pow__(val)

    def __rpow__(self, val):
        return self.val.__rpow__(val)

    def __call__(self, *index):
        return self.val(*index)

    def cget(self, *index):
        return self.val.cget(*index)
