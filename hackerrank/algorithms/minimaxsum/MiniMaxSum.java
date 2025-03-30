package hackerrank.algorithms.minimaxsum;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;

        arr.sort(null);

        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
            max += arr.get(arr.size() - 1 -i);
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        miniMaxSum(arr);
    }
}
