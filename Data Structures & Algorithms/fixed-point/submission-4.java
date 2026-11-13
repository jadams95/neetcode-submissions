class Solution {
    public int fixedPoint(int[] arr) {
        int l = 0, r = arr.length;

        while(l < r){
            int mid = l + ((r - l) / 2);

            if(arr[mid] < mid) l = mid + 1;
            else r= mid;
        }

        return l < arr.length && arr[l] == l ? l : -1;
    }
}
