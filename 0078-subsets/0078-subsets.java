class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursivity(nums, result, 0, new ArrayList<>());
        return result;
    }

    private void recursivity(int[] nums, List<List<Integer>> result, int start, List<Integer>current) {

        result.add(new ArrayList<>(current));
        for(int i=start; i<nums.length;i++) {
            current.add(nums[i]);
            recursivity(nums, result, i+1, current);
            current.remove(current.size()-1);
        }
    }
}