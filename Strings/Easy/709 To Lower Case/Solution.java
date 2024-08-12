class Solution {
    public String toLowerCase(String s) {
        StringBuilder lowerWord = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                lowerWord.append(Character.toLowerCase(c));
            } else {
                lowerWord.append(c);
            }
        }

        return lowerWord.toString();
        // Easy way
        // return s.toLowerCase();
    }
}