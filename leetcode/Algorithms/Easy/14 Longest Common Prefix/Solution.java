class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String comparator = strs[0];
        int finalPrefixLength = comparator.length();

        for (int i = 0; i < strs.length; i++) {
            int prefixLength = 0;
            int minLength = Math.min(comparator.length(), strs[i].length());

            for (int j = 0; j < minLength; j++) {
                if (comparator.charAt(j) == strs[i].charAt(j)) {
                    prefixLength++;
                } else {
                    break;
                }
            }

            finalPrefixLength = Math.min(finalPrefixLength, prefixLength);

            if (finalPrefixLength == 0) {
                return "";
            }
        }

        return comparator.substring(0, finalPrefixLength);
    }
}