class Solution {
    public int maxProfit(int[] p) {
        int profit =0;
        int bp = p[0];
        for(int i=1;i<p.length;i++) {
            profit = Math.max((p[i]- bp), profit);
            bp = Math.min(bp, p[i]);
        }
        return profit;
    }
}