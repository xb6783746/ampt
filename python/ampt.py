import numpy as np

class mlarr(np.ndarray):

    def sum(self, axis=None, dtype=None, out=None, keepdims=False):
        
        res = self.__array__().sum(axis=0)
        
        if not np.isscalar(res):
            res = res.view(mlarr)
            
        return res
    
    def __mul__(self, val):
        
        if np.isscalar(val):
            res = np.multiply(self, val)
        else :
            res = (self @ val).view(mlarr)
        
        if res.size == 1:

            res = np.asscalar(res)
            
        return res
    
    def __rmul__(self, val):
            
        return self.__mul__(val)
    
    def __truediv__(self, val):
        
        if np.isscalar(val):
            
            return np.divide(self, val)
        
        return np.linalg.lstsq(val.T, self.T)[0].T
    
    def __rtruediv__(self, val):
        
        return self.__truediv__(val)
    
    def __pow__(self, val):
        
        return np.linalg.matrix_power(self, val)
    
    def __rpow__(self, val):
        
        return np.linalg.matrix_power(self, val)
    
    def mget(self, *index):
        
        index = self.buildIndices(*index)
        
        print(index)
        if len(index) == 1:

            return self.flatten(order="F")[index[0]]

        return self[np.ix_(*index)]

    def mset(self, *index, val=None):

        index = self.buildIndices(*index)

        if len(index) == 1:

            index = np.unravel_index(index[0], self.shape, order="F")
            self[index] = val
        else:

            self[np.ix_(*index)] = val

    def buildIndices(self, *index):

        if len(index) > 1:
            index = list(index[2:]) + [index[0], index[1]]

            for i in range(0, len(index)):
                index[i] = self.dec(index[i], self.shape[i])

            return index
        else:

            index = (self.dec(index[0], self.size),);

            return index

    @staticmethod
    def dec(index, dimsize):

        if isinstance(index, slice):

            start = index.start - 1 if index.start is not None else 0
            stop = index.stop if index.stop is not None else dimsize
            step = index.step if index.step is not None else 1

            return np.arange(start, stop, step)
        if np.isscalar(index):
            index = np.array([index])

        return index - 1
    


def dotmul(a, b):

    return np.multiply(a, b)

def dotdiv(a, b):
    
    return np.divide(a, b)

def dotpow(a, b):
    
    return np.power(a, b)


def mr(arg):
    
    if np.isscalar(arg):
        return arg

    return np.block(arg).view(mlarr)

def rg(start, stop, end=None):

    return np.arange(start, stop+1, end).view(mlarr)
