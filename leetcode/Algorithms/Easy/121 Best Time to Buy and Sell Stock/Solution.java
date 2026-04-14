class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit = 0;

        for (int p : prices) {
            if (p < low) {
                low = p;
            } else {
                int currProfit = p - low;
                if (currProfit > profit) profit = currProfit;
            }
        }

        return profit;
    }
}