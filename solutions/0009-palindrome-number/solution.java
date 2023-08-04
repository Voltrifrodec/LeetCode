class Solution {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
