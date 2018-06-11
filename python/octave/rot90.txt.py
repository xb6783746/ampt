import ampt.amptlib as mpl
from ampt.core import *


@ampt_function(2, False)
def rot90(A,k,nargin,nargout = 1):
	if nargin < 1 and nargin > 2:
		mpl.print_usage()

	if not (isscalar(k) and mpl.isreal(k) and k == mpl.fix(k)):
		mpl.error('rot90: K must be a single real integer')

	k = mod(k, 4)
	nd = mpl.ndims(A)
	if k == 0:
		B = copy(A)
	elif k == 1:
		B = flipud(mpl.permute(A, mr([[2, 1, rg[3:nd:1]]])))
	elif k == 2:
		idx = stub()
		idx[rg[1:nd]] = mc([[':']])
		idx[1] = rg[mpl.rows(A):1:-1]
		idx[2] = rg[mpl.columns(A):1:-1]
		B = A(idx.cget(rg[:]))
	elif k == 3:
		idx = stub()
		B = mpl.permute(flipud(A), mr([[2, 1, rg[3:nd:1]]]))
	else:
 		mpl.error('rot90: internal error!')

	return B
