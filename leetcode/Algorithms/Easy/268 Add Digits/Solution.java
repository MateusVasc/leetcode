class Solution {
    public int missingNumber(int[] nums) {
        int output = 0;

        for (int i = 0; i <= nums.length; i++) {
            boolean missing = true;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    missing = false;
                }
            }

            if (missing) {
                output = i;
            }
        }

        return output;
    }
}