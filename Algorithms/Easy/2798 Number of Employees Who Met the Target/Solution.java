import java.util.Arrays;

class Solution {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if (hours.length == 1) {
            return hours[0] >= target ? 1 : 0;
        }

        return numberOfEmployeesWhoMetTarget(Arrays.copyOfRange(hours, 0, hours.length / 2), target)
                + numberOfEmployeesWhoMetTarget(Arrays.copyOfRange(hours, hours.length / 2, hours.length), target);
    }

    // public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    // int num = 0;

    // for (int i = 0; i < hours.length; i++) {
    // if (hours[i] >= target) {
    // num++;
    // }
    // }

    // return num;
    // }
}