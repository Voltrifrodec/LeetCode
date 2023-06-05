class Solution {
    public boolean isPalindrome(String s) {
        char[] resString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "").toCharArray();
        for(int i = resString.length - 1; i > 0; i--) {
            if(resString[(resString.length - i - 1)] != resString[i])
                return false;
        }
        
        return true;
    }
}
