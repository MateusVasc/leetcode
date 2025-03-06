import java.util.List;

public class Solution {
    
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxHourglass = Integer.MIN_VALUE;
        int line = 0;

        while(line <= 3) {
            for(int col = 0; col <= 3; col++) {
                int currHourglass = gethourglassSum(arr, line, col);

                if(maxHourglass < currHourglass) {
                    maxHourglass = currHourglass;
                }
            }
            
            line++;
        }

        return maxHourglass;
    }

    public static int gethourglassSum(List<List<Integer>> arr, int startLine, int startCol) {
        return arr.get(startLine).get(startCol) + arr.get(startLine).get(startCol + 1) + arr.get(startLine).get(startCol + 2) + 
        arr.get(startLine + 1).get(startCol + 1) + 
        arr.get(startLine + 2).get(startCol) + arr.get(startLine + 2).get(startCol + 1) + arr.get(startLine + 2).get(startCol + 2);
    }
}
