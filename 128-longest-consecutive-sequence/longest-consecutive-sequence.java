
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();      // Put all numbers in the set

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
                                                           
                                                          // Check every number
        for (int num : set) {

            if (!set.contains(num - 1)) {               //start of a sequence

                int currentNum = num;
                int count = 1;

                                                           // Find consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                                                      // Update longest sequence
                longest = Math.max(longest,count);
                }
            }
        

        return longest;
    }
}