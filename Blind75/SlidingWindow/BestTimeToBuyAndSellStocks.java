package SlidingWindow;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuyAndSellStocks(prices));
    }

    static int BestTimeToBuyAndSellStocks(int[] prices){
        int l = 0;
        int r = l+1;
        int maxProfit=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxProfit = Math.max(maxProfit,profit);
            }

            else{
                l=r;
            }
            r++;
        }
        return maxProfit;
    }
}
