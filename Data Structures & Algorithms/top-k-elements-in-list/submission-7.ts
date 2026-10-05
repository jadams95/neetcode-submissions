class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums: number[], k: number): number[] {
        const numMap = new Map<number, number>();
        const list: number[][] = new Array(nums.length + 1);

        for (let i = 0; i < list.length; i++) {
            list[i] = [];
        }

        for (const x of nums) {
            numMap.set(x, (numMap.get(x) ?? 0) + 1);
        }

        for (const [num, count] of numMap) {
            list[count].push(num);
        }

        const result: number[] = [];
        for (let i = list.length - 1; i >= 0 && result.length < k; i--) {
            result.push(...list[i]);
        }
        return result.slice(0, k);
    }
}
