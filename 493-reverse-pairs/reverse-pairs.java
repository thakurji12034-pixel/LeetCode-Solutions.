class Solution {
    int count = 0;

    public int reversePairs(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return count;
    }

    void sort(int[] a, int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;
        sort(a, l, m);
        sort(a, m + 1, r);

        int j = m + 1;
        for (int i = l; i <= m; i++) {
            while (j <= r && (long)a[i] > 2L * a[j])
                j++;
            count += j - m - 1;
        }

        merge(a, l, m, r);
    }

    void merge(int[] a, int l, int m, int r) {
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = a[i] <= a[j] ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        for (i = 0; i < t.length; i++)
            a[l + i] = t[i];
    }
}