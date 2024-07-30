class Solution(object):
    def kids_with_candies(self, candies, extra_candies):
        output = []

        greatest = self.get_greatest_number(candies)

        for i in candies:
            output.append(i + extra_candies >= greatest)

        return output
    
    def get_greatest_number(self, arr):
        greatest = 0

        for i in arr:
            if i > greatest:
                greatest = i

        return greatest
    
S = Solution()
arr = [1, 2, 3, 4, 5, 1, 5, 1]
extra = 3
print(S.kids_with_candies(arr, extra))