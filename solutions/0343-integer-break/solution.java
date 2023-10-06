class Solution {
    public int integerBreak(int n) {

        // Credits to problems that helped me solving this issue:
        //  - "93.65% Why 3s?" by vanAmsen: https://leetcode.com/problems/integer-break/discuss/4135679/93.65-Why-3s

        if(n <= 3) { // For example if n=2: 2 / 2 .= 1 + 1 = 1 * 1 = 1 <=> n - 1
            return n - 1;
        }

        // We use number 3 because it's one of the common numbers when maximizing the product.
        int div = n / 3;
        int rem = n % 3;

        if(rem == 0) {
            return (int) Math.pow(3, div);
        }
        if(rem == 1) {
            return (int) Math.pow(3,div - 1) * 4;
        }
        
        return (int) Math.pow(3, div) * 2;

    }
}
