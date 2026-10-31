import java.util.List;

public class Solution {
    
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxHourglassSum = Integer.MIN_VALUE;
        int line = 0;

        while (line <= 3) {
            for (int col = 0; col <= 3; col++) {
                int currHourglassSum = getSingleHourglassSum(arr, line, col);

                if (currHourglassSum > maxHourglassSum) maxHourglassSum = currHourglassSum;
            }

            line++;
        }

        return maxHourglassSum;
    }

    public static int getSingleHourglassSum(List<List<Integer>> arr, int startLine, int startCol) {
        int topLine = arr.get(startLine).get(startCol) + arr.get(startLine).get(startCol + 1) + arr.get(startLine).get(startCol + 2);
        int middleLine = arr.get(startLine + 1).get(startCol + 1);
        int bottomLine = arr.get(startLine + 2).get(startCol) + arr.get(startLine + 2).get(startCol + 1) + arr.get(startLine + 2).get(startCol + 2);

        return topLine + middleLine + bottomLine;
    }
}
