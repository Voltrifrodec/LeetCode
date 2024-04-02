class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        str1 = []
        str1.extend(s.index(i) for i in s)
        str2 = []
        str2.extend(t.index(i) for i in t)
                
        return True if str1 == str2 else False
        
