class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++) {
            mp.put(s.charAt(i),i);
        }
        List<Integer> result = new ArrayList<>();
        int max = 0;
        int prev = -1;

        for(int i =0;i<s.length();i++) {
            max = Math.max(mp.get(s.charAt(i)), max);
            if(max == i) {
                result.add(max-prev);
                prev = max;
            }
        }
        return result;
    }
}