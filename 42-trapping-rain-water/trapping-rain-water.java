class Solution {
    public int trap(int[] height) {

        int n = height.length;

        if (n <= 2) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Left side ka maximum
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Right side ka maximum
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Water calculate karo
        int water = 0;

        for (int i = 0; i < n; i++) {

            int level = Math.min(leftMax[i], rightMax[i]);

            water = water + level - height[i];
        }

        return water;
    }
}