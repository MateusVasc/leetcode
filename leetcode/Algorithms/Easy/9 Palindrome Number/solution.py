class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        num = x
        ans = 0

        while num >= 10:
            ans = 10 * (ans + num % 10)
            num = num // 10

        ans += num

        return x == ans


num = 121

s = Solution()
print(s.isPalindrome(num))
