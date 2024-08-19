import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int numConsistent = 0;

        Set<Character> allowedChars = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }

        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                numConsistent++;
            }
        }

        return numConsistent;
    }
}