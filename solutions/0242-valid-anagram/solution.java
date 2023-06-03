class Solution {
    // Found help on: https://walkccc.me/LeetCode/problems/0242/
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        int[] counter = new int[128];
        
        for(char c : s.toCharArray()) {
            ++counter[c];
        }
        for(char c : t.toCharArray()) {
            if(--counter[c] < 0)
                return false;
        }
        
        return true;
    }
}
