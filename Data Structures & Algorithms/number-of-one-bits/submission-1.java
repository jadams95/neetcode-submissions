class Solution {
    public int hammingWeight(int n) {
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.valueOf(n));
        // System.out.println();
        // for(int i = 32; i >= 0; )
        int res = 0;
        while(n != 0){
            n &= (n - 1);
            res++;


        }
        return res;
        }
}
