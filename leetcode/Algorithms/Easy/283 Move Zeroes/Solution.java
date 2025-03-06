class Solution {
    public void moveZeroes(int[] nums) {
        int[] zeros = new int[nums.length];
        int zeroP = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros[zeroP] = i;
                zeroP++;
            }
        }

        for (int i = --zeroP; i >= 0; i--) {
            int zeroIndex = zeros[i];

            for (int j = zeroIndex + 1; j < nums.length; j++) {
                nums[j - 1] = nums[j];
            }

            nums[nums.length - 1] = 0;
        }
    }
}