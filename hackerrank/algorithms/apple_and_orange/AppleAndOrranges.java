package hackerrank.algorithms.apple_and_orange;

import java.util.List;

public class AppleAndOrranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apls = 0;
        int orgs = 0;
        for (int ap : apples) {
            if (ap + a >= s & ap + a <= t) {
                apls++;
            }
        }

        for (int or : oranges) {
            if (or + b >= s & or + b <= t) {
                orgs++;
            }
        }

        System.out.println(apls);
        System.out.println(orgs);
    }

    public static void main(String[] args) {
        
    }
}
