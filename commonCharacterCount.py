s1 = "aabbbcccc"
s2 = "ccbbbaaaa"

def isHere(s,v):
	flag = 0
	for it in s:
		if v == it:
			flag = 1
			break

	return flag

def commonCharacterCount(s1, s2):
	commonCharacters = []
	commonCharacterCount = []
	for it1 in s1:
		for it2 in s2:
			if it1 == it2 and isHere(commonCharacters,it1) == 0:
				commonCharacters.append(it2)

	
	for i in commonCharacters:
		aux1 = s1.count(str(i))
		aux2 = s2.count(str(i))
		commonCharacterCount.append(aux2)
		commonCharacterCount.append(aux1)
		
	commonCharacterCount = sorted(commonCharacterCount)
	size = len(commonCharacters)
	commonCharacterCount = commonCharacterCount[0:size]
	

	return sum(commonCharacterCount)




		



print(commonCharacterCount(s1, s2))