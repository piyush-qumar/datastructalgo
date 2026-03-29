class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int x: nums) {
            st.add(x);
        }
        if(st.size()<nums.length)
        return true;
        else 
        return false;
    }
}