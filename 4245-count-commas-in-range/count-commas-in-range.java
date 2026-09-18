class Solution {
    public int countCommas(int n) {

        int count = 0;

        // Check every number from 1 to n
        for (int i = 1; i <= n; i++) {

            // Numbers with 4 or more digits have at least 1 comma
            if (i >= 1000) {
                count++;
            }

            // Numbers with 7 or more digits would have 2 commas
            if (i >= 1000000) {
                count++;
            }
        }

        return count;
    }
}