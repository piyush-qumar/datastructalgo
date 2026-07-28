class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        //super naive approach
        //return Math.pow(x, n);
        //the acceptable way is to shadow the behaviour of the pow
        long N=n;
        if(n<0) {
            x = 1/x;
            N = -N;
        }
        return fastpow(x, N);
    }
        
        private double fastpow(double x, long N) {

            if(N==0) return 1.0;
            double ans = 1.0;
            double half = fastpow(x, N/2);

            if(N%2==0) {
                ans = ans * half * half;
            }
            if(N%2!=0) {
                ans = ans * half * half * x;
            }

            return ans;
        }
        
}