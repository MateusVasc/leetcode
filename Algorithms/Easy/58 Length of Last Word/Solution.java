import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLastWord(String s) { // Easy way -->
        String[] arrS = s.split(" ");

        return arrS[arrS.length - 1].length();
    }

    public int lengthOfLastWordAgain(String s) { // Sad way -->
        List<String> arrS = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                str.append(s.charAt(i));
            } else {
                if (str.length() > 0) {
                    arrS.add(str.toString());
                    str.delete(0, str.length());
                }
            }
        }

        if (str.length() > 0) {
            arrS.add(str.toString());
        }

        return arrS.get(arrS.size() - 1).length();
    }
}