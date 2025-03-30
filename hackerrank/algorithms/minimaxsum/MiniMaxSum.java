package hackerrank.algorithms.minimaxsum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void myMiniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;

        arr.sort(null);

        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
            max += arr.get(arr.size() - 1 -i);
        }

        System.out.println(min + " " + max);
    }

    public static void streamsMiniMaxSum(List<Integer> arr) {
        List<Long> arrSorted = arr.stream()
            .mapToLong(Integer::longValue)
            .sorted()
            .boxed()
            .collect(Collectors.toList());

        long minSum = arrSorted.stream().limit(4).mapToLong(Long::longValue).sum();
        long maxSum = arrSorted.stream().skip(1).mapToLong(Long::longValue).sum();

        System.out.println(minSum + " " + maxSum);
    }

    public static void noSortMiniMaxSum(List<Integer> arr) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        myMiniMaxSum(arr);
        streamsMiniMaxSum(arr);
        noSortMiniMaxSum(arr);

        /*
         * I'd go with noSortMiniMaxSum solution
         * 
         * - It makes no unnecessary sorts
         * - Has O(n) time complexity
         * - Pretty concise code with no unnecessary stuff
         */
    }
}
