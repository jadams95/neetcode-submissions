// class Solution {
//     public int fixedPoint(int[] arr) {
//         // alrdy sorted -> distinct
//         int l = 0, r = arr.length;
        
//         while(l < r){
//             int mid = l + ( r - l) / 2;
//             if(arr[mid] < mid){
//                 l = mid + 1;
//             } else {
//                 r = mid;
//             }
//         }
//         return l < arr.length && arr[l] == l ? l : 1;
//     }
// }
class Solution {
    public int fixedPoint(int[] arr) {
        int left=0,right=arr.length;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<mid)left=mid+1;
            else right=mid;
        }
        return left<arr.length&&arr[left]==left?left:-1;
    }
}
