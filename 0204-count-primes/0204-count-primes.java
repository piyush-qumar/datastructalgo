class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean mp[] = new boolean[n]; // perhaps we are sticking to strictly lessa than n
        for(int i=2;i*i<=n;i++) {
            if(!mp[i]) {
                for(int j=i*i;j<n;j+=i) {
                    mp[j] = true;
                }
            }
        }
        int count =0;
        for(int x = 2;x<n;x++) {
            if(!mp[x])
            count++;
        }
        return count;
    }
}