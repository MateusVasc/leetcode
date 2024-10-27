import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Integer> vowelsI = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelsI.add(i);
            }
        }

        int leftP = 0;
        int rightP = vowelsI.size() - 1;

        StringBuilder word = new StringBuilder(s);

        while (leftP < rightP) {
            char temp = word.charAt(vowelsI.get(leftP));
            word.setCharAt(vowelsI.get(leftP), word.charAt(vowelsI.get(rightP)));
            word.setCharAt(vowelsI.get(rightP), temp);

            leftP++;
            rightP--;
        }

        return word.toString();
    }
}