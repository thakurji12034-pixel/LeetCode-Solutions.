class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 is present before starting
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            int remainder = sum % k;

            // If remainder is already present
            if (map.containsKey(remainder)) {

                int previousIndex = map.get(remainder);

                // Subarray length should be at least 2
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {
                // Store only the first index
                map.put(remainder, i);
            }
        }

        return false;
    }
}