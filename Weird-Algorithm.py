# my python solution to https://cses.fi/problemset/task/1068/

import sys

n = int(sys.stdin.readline())    # read just one line

print(str(int(n))+' ',end='')    # transform integer to String to print it and concatenate to a space,  the 'end=''  part is to not return to line

while n > 1:
	if(n%2==0):
		n=n/2
		print(str(int(n))+' ',end='')
	else:
		n=3*n+1
		print(str(int(n))+' ',end='')
