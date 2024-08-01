class Solution {
    public int[] runningSum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] += count;
            count = nums[i];
        }

        return nums;
    }
}