class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            // Look ahead for the first valid price
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) { // Found discount
                    prices[i] -= prices[j];   // Apply discount
                    break;                     // Stop inner search
                }
            }
        }
        return prices;


        
    }
}