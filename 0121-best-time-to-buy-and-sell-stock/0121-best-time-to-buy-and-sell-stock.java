class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int lowestPrice = prices[0];

        for(int i=1; i< prices.length; i++){
            int profit = prices[i] - lowestPrice;
            maxP = Math.max(maxP, profit);
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }

        return maxP;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna