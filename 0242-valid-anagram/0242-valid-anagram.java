class Solution {
    public boolean isAnagram(String s, String t) {
        //my approach is to store the characters in a hashmap and compare if both are equal
        // or sort the strings and check if equal.(it will be slow)
        if(s.length()!=t.length()) return false;
        int[] freq = new int [26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int x: freq) {
            if(x!=0)
            return false;
        }
        return true;
    }
}