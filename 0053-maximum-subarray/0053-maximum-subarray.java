class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        for(int x: nums) {
            if(total <0)
                total = 0;

            total = total + x;
            res = Math.max(total, res);
            
        }
        return res;
        
    }
}