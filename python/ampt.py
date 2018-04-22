import numpy as np

class mlarr(np.ndarray):

    def sum(self, axis=None, dtype=None, out=None, keepdims=False):
        
        res = self.__array__().sum(axis=0);
        
        if not np.isscalar(res):
            res = res.view(mlarr)
            
        return res;
    
    def __mul__(self, val):
        
        if np.isscalar(val):
            res = np.multiply(self, val);
        else :
            res = (self @ val).view(mlarr)
        
        if res.size == 1:

            res = np.asscalar(res);
            
        return res;
    
    def __rmul__(self, val):
            
        return self.__mul__(val);
    
    def __truediv__(self, val):
        
        if np.isscalar(val):
            
            return np.divide(self, val)
        
        return np.linalg.lstsq(val.T, self.T)[0].T
    
    def __rtruediv__(self, val):
        
        return self.__truediv__(val);
    
    def __pow__(self, val):
        
        return np.linalg.matrix_power(self, val)
    
    def __rpow__(self, val):
        
        return np.linalg.matrix_power(self, val)
    
    def mget(self, *index):
        
        index = self.buildIndices(*index);
        
        if len(index) == 1:
        
            return self.flatten(order="F")[index[0]]
        
        return self[np.ix_(*index)];
    
    def mset(self, *index, val=None):
        
        index = self.buildIndices(*index);
        
        print(index)
        print(len(index))
        if len(index) == 1:
            
            index = np.unravel_index(index[0], self.shape, order="F")
            self[index] = val
        else:
            
            self[np.ix_(*index)] = val;
        
    def buildIndices(self, *index):
        
        index = [x - 1 for x in index]
        
        if len(index) > 1:
            index = index[2:] + [index[0], index[1]]
        
        return index;
    


def dotmul(a, b):

    return np.multiply(a, b)

def dotdiv(a, b):
    
    return np.divide(a, b)

def dotpow(a, b):
    
    return np.power(a, b)


def mr(arg):
    
    return np.array(arg).view(mlarr)
