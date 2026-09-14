class Solution {
    public int[] twoSum(int[] numbers, int target) {


        HashMap<Integer, int[]> tableMap = new HashMap<Integer, int[]>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target) {
                    int[] tempArr = new int [] {i + 1, j + 1};
                    tableMap.put(target, tempArr);
                }
            }
        }
        return tableMap.get(target);
    }
}
