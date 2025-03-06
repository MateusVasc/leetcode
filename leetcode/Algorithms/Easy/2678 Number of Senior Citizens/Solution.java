class Solution {
    public int countSeniors(String[] details) {
        int numElder = 0;

        for (int i = 0; i < details.length; i++) {
            int decimal = Character.getNumericValue(details[i].charAt(11));
            int unit = Character.getNumericValue(details[i].charAt(12));

            if ((decimal > 6 && unit > 1)) {
                numElder++;
            }
        }

        return numElder;
    }
}