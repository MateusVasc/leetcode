class Solution {
    public String reversePrefix(String word, char ch) {
        int prefixIndex = word.indexOf(ch);

        String prefix = word.substring(0, prefixIndex + 1);
        String suffix = word.substring(prefixIndex + 1);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();

        return reversedPrefix + suffix;
    }
}