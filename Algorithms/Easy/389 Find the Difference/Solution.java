class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;

        for (int i = 0; i < t.length(); i++) {
            tSum += t.charAt(i);

            if (i < t.length() - 1) {
                sSum += s.charAt(i);   
            }
        }

        return (char) (tSum - sSum);
    }
}