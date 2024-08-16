import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        char[] symbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] values = { 1, 5, 10, 50, 100, 500, 1000 };
        HashMap<Character, Integer> romanChars = new HashMap<>();

        for (int i = 0; i < symbols.length; i++) {
            romanChars.put(symbols[i], values[i]);
        }

        int output = 0;
        int j = 0;

        while (j < s.length()) {
            char curr = s.charAt(j);

            if (j + 1 < s.length()) {
                char next = s.charAt(j + 1);

                if (romanChars.get(curr) < romanChars.get(next)) {
                    output += romanChars.get(next) - romanChars.get(curr);
                    j += 2;
                    continue;
                }
            }

            output += romanChars.get(curr);
            j++;
        }

        return output;
    }
}