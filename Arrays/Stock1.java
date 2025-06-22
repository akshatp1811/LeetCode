public class Stock1{
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profitToday);
            minSoFar = Math.min(minSoFar, prices[i]);
        }

        return maxProfit;
    }
}

