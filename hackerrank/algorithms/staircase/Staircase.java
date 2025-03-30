package hackerrank.algorithms.staircase;

public class Staircase {

    public static void staircase(int n) {
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

    public static void main(String[] args) {
        staircase(4);
    }
}
