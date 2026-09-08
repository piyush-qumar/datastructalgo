class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;


        long K = n;
        if(n<0) {
            x= 1/x;
            K = -K;
        }
        return powfunc(x, K);
    }

    private double powfunc(double x, long k) {
        if(k == 0) return 1.0;

        double ans = powfunc(x, k/2);

        double result = 1.0;
        if(k%2==0) {
            result = result * ans * ans;
        }
        else
            result = result * ans * ans * x;

            return result;
    }
}