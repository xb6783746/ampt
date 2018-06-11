import numpy as np
from ampt.utils import *


class mlresizeblearr(np.lib.user_array.container):

    def build_indices(self, index):
        if len(index) == 1:
            index = build_indices(index, (self.size,))
            return True, index[0]

        index = build_indices(index, self.shape)

        return False, index

    def create_shape(self, indices):
        m = tuple(max(indices[i]) + 1 for i in range(0, len(indices)))

        new_dims_count = len(indices) - self.ndim
        new_dims = tuple(m[i] for i in range(0, new_dims_count))

        slc = m[new_dims_count:]

        old_dims = tuple(max(slc[i], self.shape[i]) for i in range(0, self.ndim))

        new_shape = new_dims + old_dims
        return new_shape

    def try_extend(self, indices):
        new_shape = self.create_shape(indices)

        if dims_greater(new_shape, self.shape):
            self.extend(new_shape)

    def try_extend_linear(self, indices):
        max_index = max(indices)

        if is_vector(self) and max_index >= vector_size(self):
            self.extend_linear(max_index + 1)

    def extend(self, new_shape):
        new_dims_count = len(new_shape) - self.ndim
        ind = tuple(0 for i in range(0, new_dims_count)) + tuple([slice(0, n) for n in self.shape])
        new_arr = np.zeros(new_shape, dtype=self.array.dtype)
        new_arr[ind] = self.array
        self.array = new_arr

    def extend_linear(self, new_size):
        new_shape = (1, new_size,) if is_row_vector(self) else (new_size, 1)
        self.extend(new_shape)

    def resize(self, new_shape):
        new_dims = len(new_shape)
        old_dims = self.ndim

        dims = max(new_dims, old_dims)

        old_shape = self.shape + tuple(0 for x in range(0, new_dims - old_dims))
        new_shape = new_shape + tuple(0 for x in range(0, old_dims - new_dims))

        new_arr = np.zeros(new_shape, dtype=self.array.dtype)

        indices = tuple(slice(0, min(old_shape[i], new_shape[i])) for i in range(0, dims))

        new_arr[indices[:new_dims]] = self[indices[:old_dims]]

        return new_arr
