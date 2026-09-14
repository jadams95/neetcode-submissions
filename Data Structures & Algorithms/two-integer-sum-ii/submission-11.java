class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x = 0, y = numbers.length - 1;
        while(x < y){
            int summation = numbers[x] + numbers[y];

            if(summation > target){
                y--;
            } else if(summation < target){
                x++;
            } else {
                return new int []{x + 1, y + 1};
            }
        }
        return new int[0];
    }
}
