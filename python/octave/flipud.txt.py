import ampt.amptlib as mpl
from ampt.core import *


@ampt_function(1, False)
def flipud(x,nargin,nargout = 1):
	if nargin != 1:
		mpl.print_usage()

	y = flip(x, 1)
	return y
