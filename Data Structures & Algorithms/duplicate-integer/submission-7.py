class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicateSets = set()
        for x in range(len(nums) - 1):
            print(nums[x])
            duplicateSets.add(nums[x])
            if(nums[x + 1] in duplicateSets):
                return True;

        return False;