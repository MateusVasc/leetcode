from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0: 
            return ""
        
        prefix = strs[0]

        if len(strs) == 1:
            return prefix
        
        finalPrefixLen = len(strs)

        for i in strs[1:]:
            currPrefixLen = 0
            for j in range(len(i)):
                if j < len(prefix):
                    if i[j] == prefix[j]:
                        currPrefixLen += 1
            if currPrefixLen < finalPrefixLen:
                finalPrefixLen = currPrefixLen

        return prefix[:finalPrefixLen]
    
    # A better solution with builtin startswith
    def longestCommonPrefixBetter(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        prefix = strs[0]
        
        for word in strs[1:]:
            while not word.startswith(prefix):
                prefix = prefix[:-1]
                if not prefix:
                    return ""
        
        return prefix




arr = ["flower","flow","flight"]
s = Solution()
print(s.longestCommonPrefix(arr))
