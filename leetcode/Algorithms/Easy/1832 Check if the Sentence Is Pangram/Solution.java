class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int i = c - 'a';

                if (!alphabet[i]) {
                    alphabet[i] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}
