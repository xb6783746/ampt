import ampt.amptlib as mpl
from ampt.core import *


@ampt_function(2, True)
def repmat(A,m,varargin,nargin,nargout = 1):
	if nargin < 2:
		mpl.print_usage()

	if nargin == 3:
		n = varargin(1)
		if not mpl.isempty(m) and mpl.isempty(n):
			m = transpose(m(rg[:]))
			n = 1
		elif mpl.isempty(m) and not mpl.isempty(n):
			m = transpose(n(rg[:]))
			n = 1
		elif mpl.isempty(m) and mpl.isempty(n):
			m=n = 1
		else:
 			if mpl.all(mpl.size(m) > 1):
				m = m(rg[:], 1)
				if mpl.numel(m) < 3:
					n = copy(n(end))
				else:
 					n = mr([[]])


			if mpl.all(mpl.size(n) > 1):
				n = copy(n(rg[:],1))

			m = transpose(m(rg[:]))
			n = transpose(n(rg[:]))

	else:
 		if nargin > 3:
			if isscalar(m) and mpl.all(mpl.cellfun('numel', varargin) == 1):
				m = mr([[m, varargin(rg[:])]])
				n = mr([[]])
			else:
 				mpl.error('repmat: all input arguments must be scalar')

		elif mpl.isempty(m):
			m=n = 1
		elif isscalar(m):
			n = copy(m)
		elif mpl.ndims(m) > 2:
			mpl.error('repmat: M has more than 2 dimensions')
		elif mpl.all(mpl.size(m) > 1):
			m = transpose(m(rg[:],1))
			n = mr([[]])
		else:
 			m = transpose(m(rg[:]))
			n = mr([[]])


	idx = mr([[m, n]])
	if mpl.all(idx < 0):
		mpl.error('repmat: invalid dimensions')
	else:
 		idx = mpl.max(idx, 0)

	if mpl.numel(A) == 1:
		if mpl.any(idx == 0):
			x = mpl.resize(A, idx)
		else:
 			x = stub()
			x[rg[1:mpl.prod(idx)]] = copy(A)
			x = mpl.reshape(x, idx)

	elif mpl.ndims(A) == 2 and mpl.length(idx) < 3:
		if mpl.issparse(A):
			x = mpl.kron(mpl.ones(idx), A)
		else:
 			m = mpl.rows(A)
			n = mpl.columns(A)
			p = copy(idx(1))
			q = copy(idx(2))
			x = mpl.reshape(A, m, 1, n, 1)
			x = copy(x(rg[:],mpl.ones(1, p),rg[:],mpl.ones(1, q)))
			x = mpl.reshape(x, m * p, n * q)

	else:
 		aidx = mpl.size(A)
		idx[rg[end + 1:mpl.length(aidx)]] = 1
		aidx[rg[end + 1:mpl.length(idx)]] = 1
		cidx = mpl.cell(2, mpl.length(aidx))
		for i in rg[1:mpl.length(aidx)]:
			cidx[1,i] = ':'
			cidx[2,i] = mpl.ones(1, idx(i))

		aaidx = copy(aidx)
		aaidx[2,rg[:]] = 1
		A = mpl.reshape(A, aaidx(rg[:]))
		x = mpl.reshape(A(cidx.cget(rg[:])), dotmul(idx, aidx))

	return x
