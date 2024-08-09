class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }

        return "";
    }

    public boolean isPalindrome(String word) {
        StringBuilder s = new StringBuilder(word);

        return s.toString().equals(s.reverse().toString());
    }
}