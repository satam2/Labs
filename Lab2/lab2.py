class lab2():
    def isAnagram(self, s:str,t:str) -> bool:
        if t is None and s is None:
            return True
        if(t != None and s == None) or (s != None and t == None) or (len(t)!=len(s)):
            return False
        for char in s:
            if char not in t:
                return False
            
        return True
    
# test = lab2()
# print(test.isAnagram("beauty","ytuaeb"))


