import ampt.amptlib as mpl
from ampt.core import *


@ampt_function(2, False)
def flip(x,dim,nargin,nargout = 1):
	idx = stub()
	idx = stub()
	if nargin < 1 and nargin > 2:
		mpl.print_usage()

	nd = mpl.ndims(x)
	sz = mpl.size(x)
	if nargin == 1:
		dim = mpl.find(sz > 1, 1)
		if not dim:
			dim = 1

	elif not (isscalar(dim) and mpl.isindex(dim)):
		mpl.error('flip: DIM must be a positive integer')

	idx[rg[1:mpl.max(nd, dim)]] = mc([[':']])
	idx[dim] = rg[mpl.size(x, dim):1:-1]
	y = x(idx.cget(rg[:]))
	return y
