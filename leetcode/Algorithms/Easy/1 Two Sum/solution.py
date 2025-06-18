from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        sum_dict = {}

        for i in range(len(nums)):
            needed_num = target - nums[i]
            if sum_dict.get(needed_num) is not None:
                ans.append(sum_dict.get(needed_num))
                ans.append(i)
                return ans
            
            sum_dict[nums[i]] = i
        
        return ans

    

nums = [2,7,11,15]
target = 9

s = Solution()
print(s.twoSum(nums, target))