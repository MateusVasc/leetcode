class Solution:
    def romanToInt(self, s: str) -> int:
        map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        sSize = len(s)
        i = 0
        sum = 0

        while i < sSize:
            j = i + 1

            if i == sSize - 1:
                sum += map[s[i]]
                return sum

            left = s[i]
            right = s[j]

            mapLeft = map[left]
            mapRight = map[right]

            if mapLeft >= mapRight:
                sum += mapLeft
                i += 1
            else:
                sum += mapRight - mapLeft
                i += 2

        return sum
    

input = "III"
input2 = "LVIII"
input3 = "MCMXCIV"


s = Solution()
print(s.romanToInt(input3))
