class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        newSet = set()
        for x in nums:
            if(x in newSet):
                return True
            newSet.add(x)
        return False
        