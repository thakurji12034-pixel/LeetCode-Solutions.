class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find minimum and maximum index
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Make minIndex smaller and maxIndex larger
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // 1. Both from front
        int front = maxIndex + 1;

        // 2. Both from back
        int back = n - minIndex;

        // 3. One from front and one from back
        int both = (minIndex + 1) + (n - maxIndex);

        return Math.min(front, Math.min(back, both));
    }
}