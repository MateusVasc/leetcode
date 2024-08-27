class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];

        int i = 0;
        int p = 0;

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else if (n != 0) {
            for (int j = 0; j < merged.length; j++) {
                if (i < m && (p >= n || nums1[i] <= nums2[p])) {
                    merged[j] = nums1[i];
                    i++;
                } else if (p < n) {
                    merged[j] = nums2[p];
                    p++;
                }
            }

            System.arraycopy(merged, 0, nums1, 0, m + n);
        }
    }
}