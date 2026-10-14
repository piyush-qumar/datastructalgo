class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0;
        int ret = 0;
        for (int x : nums) {
            if (x == 1) {
                res++;
                ret = Math.max(ret, res);
            }
            else
            res = 0;
        }
        return ret;
    }
}