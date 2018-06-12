n = 134008
def isLucky(n):
	nlist = [int(x) for x in str(n)]

	if len(nlist) % 2 == 0:
		
		aux = int(len(nlist)/2)
		print(nlist[0:aux])
		print (nlist[aux : len(nlist)])
		return sum(nlist[0:aux]) == sum(nlist[aux : len(nlist) - 1])

print(isLucky(n))