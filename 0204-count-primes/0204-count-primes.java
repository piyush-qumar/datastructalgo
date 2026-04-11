class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] composit = new boolean[n]; // n because strictly less than n is expected
        for(int i=2;(long)i*i<=n;i++) {
            if(!composit[i]) {
                for(int j = i*i; j<n;j+=i) {
                    composit[j] = true;
                }
            }
        }
        int count =0;
        for(int i=2;i<n;i++) {
            if(!composit[i]) count++;
        }
        return count;
    }
}