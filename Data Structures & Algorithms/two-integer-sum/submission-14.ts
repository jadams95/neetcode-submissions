class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        const twoSumMap = new Map<number, number>();

        for(let x = 0; x < nums.length; x++){
            const complement = target - nums[x];
            if(twoSumMap.has(complement)){
                return [twoSumMap.get(complement)!, x];
            }
            twoSumMap.set(nums[x], x);
        }
        return [];

    }
}
