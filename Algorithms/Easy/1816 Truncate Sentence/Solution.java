import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {
        String[] sentence = s.split(" ");
        return String.join(" ", Arrays.copyOfRange(sentence, 0, k));
    }
}