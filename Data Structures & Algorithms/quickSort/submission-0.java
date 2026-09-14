// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSortHelper(pairs, 0, pairs.size() - 1);
        return pairs;

    }

    private void quickSortHelper(List<Pair> arr, int s, int e){
        // HashMap<Integer, List<String>> hashTable = new HashMap<Integer, String>();
        if(e - s + 1 <= 1){
            return;
        }

        Pair pivot = arr.get(e);

        int left = s;
        // int pivot = pairs.length();



        for(int i = s; i < e; i++){
            // int leftPos = pairs.get(rLen).key;
            // String keyVals = pairs.get(i).value;
            if(arr.get(i).key < pivot.key){
                Pair tmp = arr.get(left);
                arr.set(left, arr.get(i));
                arr.set(i, tmp);
                left++;
            } 
        }

        arr.set(e, arr.get(left));
        arr.set(left, pivot);

        quickSortHelper(arr, s, left - 1);
        quickSortHelper(arr, left + 1, e);

    }
}
