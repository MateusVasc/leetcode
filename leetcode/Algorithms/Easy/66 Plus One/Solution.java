import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> arrD = new ArrayList<>();

        for (int d : digits) {
            arrD.add(d);
        }

        for (int i = arrD.size() - 1; i >= 0; i--) {
            if (arrD.get(i) != 9) {
                arrD.set(i, arrD.get(i) + 1);
                break;
            } else {
                arrD.set(i, 0);
            }
        }

        if (arrD.get(0) == 0) {
            arrD.add(0, 1);
        }

        int[] plusDigits = new int[arrD.size()];

        for (int i = 0; i < plusDigits.length; i++) {
            plusDigits[i] = arrD.get(i);
        }

        return plusDigits;
    }
}