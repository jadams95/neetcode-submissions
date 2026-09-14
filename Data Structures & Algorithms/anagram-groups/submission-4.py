class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramList = defaultdict(list)
        


        # dict()
        

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
        # if the len of the string is the same and the characters counts in the string are the same
            anagramList[tuple(count)].append(s)
        return list(anagramList.values())
         

        