class Solution(object):
    def runningSum(self, nums):
        count = 0

        for i in range(len(nums)):
            nums[i] += count
            count = nums[i]

        return nums