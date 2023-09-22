class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Loop through nums2 (smaller array) and set int j to m.
        for (int i = 0, j = m; i < n; i++) {
            // Once we arrive at the first '0' in nums1, fill remaining placeholders with nums2[i].
            nums1[j] = nums2[i];
            j++;
        }
        // Sort nums1 into increasing order.
        Arrays.sort(nums1);
    }
}