class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const set = new Set();
        for(const x of nums){
            if(set.has(x)) return true;
            set.add(x)
        }

        return false;

    }
}
