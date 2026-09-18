class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> answer = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (answer.contains(nums[i])) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3) {
                answer.add(nums[i]);
            }
        }
        return answer;
    }
}