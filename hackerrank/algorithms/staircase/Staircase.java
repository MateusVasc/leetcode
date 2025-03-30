package hackerrank.algorithms.staircase;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Staircase {

    public static void myStaircaseSolution(int n) {
        char stairChar = '#';
        char stairBlank = ' ';
        StringBuilder stair = new StringBuilder(String.valueOf(stairBlank).repeat(n - 1));
        stair.append(stairChar);

        int i = n - 1;
        while (i > 0) {
            System.out.println(stair.toString());
            stair.setCharAt(--i, stairChar);
        }

        System.out.println(stair.toString());
    }

    public static void streamsStaircaseSolution(int n) {
        IntStream.rangeClosed(1, n)
            .forEach(i -> System.out.println(" ".repeat(n - 1) + "#".repeat(i)));
    }

    public static void arrStaircaseSolution(int n) {
        char[] stairs = new char[n];
        Arrays.fill(stairs, ' ');

        for (int i = n - 1; i >= 0; i--) {
            stairs[i] = '#';
            System.out.println(stairs);
        }
    }

    public static void main(String[] args) {
        myStaircaseSolution(4);
        streamsStaircaseSolution(4);
        arrStaircaseSolution(4);

        /*
         * My Solution
         * 
         * Pros:
         *  - Uses StringBuilder, which is efficient when it comes to string manipulation
         *  - Only one update per iteration
         * Cons:
         *  - The code could better writen
         * 
         * Streams Solution
         * 
         * Pros:
         *  - Just beautiful readable code. Very well writen
         * Cons:
         *  - May be less efficient due to the creation of intermediate objects
         * 
         * Array Solution
         * 
         * Pros:
         *  - Very memory efficient
         *  - No intermediate objects
         *  - Inplace
         * Cons:
         *  - Idk tbh... 
         */
    }
}
