class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array in increasing order.
        Arrays.sort(nums);

        // The majority number is always greater than the length/2 so return that elem.
        return nums[nums.length / 2];
    }
}