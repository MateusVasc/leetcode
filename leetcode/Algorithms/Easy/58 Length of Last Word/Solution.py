class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        arrS = []
        currString = ""

        for i in range(len(s)):
            if s[i] != " ":
                currString += s[i]
            else:
                if len(currString) > 0:
                    arrS.append(currString)
                currString = ""
        
        if len(currString) > 0:
            arrS.append(currString)

        return len(arrS[-1])