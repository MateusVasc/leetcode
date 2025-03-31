package hackerrank.algorithms.birthday_cake_candles;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = Integer.MIN_VALUE;
        int nTallest = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > tallest) {
                tallest = candles.get(i);
                nTallest = 1;
            } else if (candles.get(i) == tallest) {
                nTallest++;
            }
        }

        return nTallest;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(3, 2, 1, 3));
        System.out.println(birthdayCakeCandles(arr));
    }
}
