import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] count = new int[51];

        // Har size-k subarray
        for (int i = 0; i <= nums.length - k; i++) {

            Set<Integer> set = new HashSet<>();

            // Current subarray ke elements
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Har number ko is subarray ke liye ek baar count karo
            for (int x : set) {
                count[x]++;
            }
        }

        // Largest number jiska count exactly 1 hai
        int ans = -1;

        for (int i = 0; i <= 50; i++) {
            if (count[i] == 1) {
                ans = i;
            }
        }

        return ans;
    }
}