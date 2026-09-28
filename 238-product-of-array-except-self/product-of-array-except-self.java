class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Initially 1
        int product = 1;

        // Store product of all elements on the left
        for (int i = 0; i < n; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        // Store product of all elements on the right
        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * nums[i];
        }

        return answer;
    }
}