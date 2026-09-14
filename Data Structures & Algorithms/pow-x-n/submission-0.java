class Solution {
    public double myPow(double x, int n) {
        // x can be 0 then return 0 because 0 times 0 is always 0
        if( x == 0) return 0;
        
        // if it's a power of n and n is equal to 0 then return 1
        if(n == 0) return 1;
        double res = 1;
        long power = abs((long) n);

        // return x *
        // // 2.0000 * -2 == 1/4 -3 == 1/8
        // // 2 ^ x * n - when Number is a fractional number of x
        // // 2 ^ x * n - when number is a positive real number of x then a will be a factor of x 
        // double a = x * x ^ n
        
        while(power > 0){
            if((power & 1) == 1){
                res *= x;
            }
            x *= x;
            power >>= 1;
        }
        return (n >= 0) ? res : 1 / res;


    }

    public long abs(long a){
        return a < 0 ? -a : a;
    }
}
