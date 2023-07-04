class Solution {
    public int singleNumber(int[] nums) {
        
        int match = 0;          // Additional variable that will be used for XOR
        
        for(int num : nums)     // For loop - XOR with all of the elements in array. 
            match ^= num;       // XOR (Exclusive OR) returns 1 only when both of the elements are different; otherwise 0.
            
        
        return match;           // Return the final element
    }
}
