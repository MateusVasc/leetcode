from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        i = len(digits) - 1

        while i >= 0:
            if digits[i] != 9:
                digits[i] += 1
                break
            else:
                digits[i] = 0
            i -= 1
            
        if digits[0] == 0:
            digits.insert(0, 1)

        return digits