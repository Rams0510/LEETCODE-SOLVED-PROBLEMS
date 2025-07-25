class Solution {
    public int maxProfit(int[] prices) {
        int mi=prices[0],mx=0;
        for(int i=1;i<prices.length;i++){
            mx=Math.max(mx,prices[i]-mi);
            if(prices[i]<mi) mi=prices[i];
        }
        return mx;
    }
}