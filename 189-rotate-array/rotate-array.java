class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        // Move each element to its new position
        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            temp[newPosition] = nums[i];
        }

        // Copy temp array into nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}