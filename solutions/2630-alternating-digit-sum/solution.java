class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int j = 0;
        for(char c : Integer.toString(n).toCharArray()) {
            sum += j % 2 == 0 ? Character.getNumericValue(c) : Character.getNumericValue(c) * -1;
            j++;
        }
        return sum;
    }
}
