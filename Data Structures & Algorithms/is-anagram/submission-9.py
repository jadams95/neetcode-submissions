class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        sMap, tMap = {}, {}
        
        for x in range(len(s)):
            sMap[s[x]] = 1 + sMap.get(s[x], 0)
            tMap[t[x]] = 1 + tMap.get(t[x], 0)

        return sMap == tMap
        

        