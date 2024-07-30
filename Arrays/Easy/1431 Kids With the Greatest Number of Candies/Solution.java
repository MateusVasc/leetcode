import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();

        int greatest = getGreatestNumber(candies);

        for (int i = 0; i < candies.length; i++) {
            output.add(extraCandies + candies[i] >= greatest);
        }

        return output;
    }

    public int getGreatestNumber(int[] arr) {
        int greatest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        return greatest;
    }
}