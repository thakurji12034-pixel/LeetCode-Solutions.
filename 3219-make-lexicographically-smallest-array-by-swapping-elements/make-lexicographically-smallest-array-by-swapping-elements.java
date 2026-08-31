import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;
 
        // Store value and its original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];  // value
            arr[i][1] = i;        // original index
        }

        // Sort according to value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = 0;

        while (start < n) {

            int end = start;

            // Find one group
            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            // Store original indexes
            ArrayList<Integer> indexes = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indexes.add(arr[i][1]);
            }

            // Sort indexes
            Collections.sort(indexes);

            // Put sorted values at sorted indexes
            for (int i = 0; i < indexes.size(); i++) {
                nums[indexes.get(i)] = arr[start + i][0];
            }

            start = end + 1;
        }

        return nums;
    }
}