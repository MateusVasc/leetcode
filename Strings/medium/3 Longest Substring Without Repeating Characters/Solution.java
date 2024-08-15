import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> substrings = new HashMap<>();
        int substringLength = 0;
        int longestSubstringLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!substrings.containsKey(c) || substrings.get(c) < start) {
                substrings.put(c, i);
                substringLength++;

            } else {
                if (longestSubstringLength < substringLength) {
                    longestSubstringLength = substringLength;
                }

                start = substrings.get(c) + 1;
                substringLength = i - start + 1;

                substrings.put(c, i);
            }
        }

        if (longestSubstringLength < substringLength) {
            longestSubstringLength = substringLength;
        }

        return longestSubstringLength;
    }
}
