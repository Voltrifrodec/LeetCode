class Solution {
    public int removeDuplicates(int[] nums) {
        // With help from NeetCode's video: https://www.youtube.com/watch?v=DEJAZBq0FDA&ab_channel=NeetCode

        if(nums.length == 0)
            return 0;

        int leftPointer = 1;
        for(int i = 1; i < nums.length; i++) { // i == rightPointer?
            if(nums[i] != nums[i - 1]) {
                nums[leftPointer] = nums[i]; // "Swap" the value at the leftPointer's position
                leftPointer++; // Move the pointer
            }
        }

        return leftPointer; // How many unique values are inside

    }
}
