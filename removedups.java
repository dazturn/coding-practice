class Solution {
    public int removeDuplicates(int[] nums) {
        // Create index to represent k and account for first elem.
        int indx = 1;

        for (int i = 1; i < nums.length; i++) {
            // If the previous elem does not equal the current elem, then move it to the next available index before increasing index.
            if (nums[i - 1] != nums[i]) {
                nums[indx] = nums[i];
                indx++;
            }
        }
        return indx;
    }
}