class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit =0;
        int maxp =0;
        for(int i=0;i< prices.length;i++){
            profit = prices[i]- min;
            min = Math.min(min,prices[i]);
            maxp = Math.max(maxp,profit);
        }
        return maxp;
    }
}
