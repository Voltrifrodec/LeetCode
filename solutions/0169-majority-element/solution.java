class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0)
                temp = nums[i];
            count += (temp == nums[i]) ? 1 : -1;
        }

        return temp;
    }
}
