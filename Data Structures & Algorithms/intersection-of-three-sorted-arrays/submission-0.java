class Solution {
    public int[] arraysIntersection(int[] arr1, int[] arr2, int[] arr3){
        // arr1, arr2, arr3 
        // arr1[i] < as i increases
        // arr1.length != arr2.length, 
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();


        // int l = 0;
        // int r = Math.max(arr1.length, arr2.length);
        // r = Math.max(arr1.length, arr3.length);
        // int[] res = new int[1];
        while(i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else {
                int smallest = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
                if(arr1[i] == smallest) i++;
                if(arr2[j] == smallest) j++;
                if(arr3[k] == smallest) k++;
            }
            // terminate for the shorter of array 2, 3
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
