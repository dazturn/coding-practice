class Solution {
    public int removeElement(int[] nums, int val) {
        // This index is created to replace the first k elems.
        int indx = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current elem does not equal val, then move it to the index and increase the index by 1.
            if (nums[i] != val) {
                nums[indx] = nums[i];
                indx++;
                }
        }
        
        return indx;
    }
}