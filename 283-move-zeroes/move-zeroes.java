class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
                         // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
                                     // Step 2: Fill remaining positions with 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}