package Arrays;

public class BuySellStock {

    public static void main(String[] args) {

        int[] arr = {1,2,4,2,5,7,2,4,9,0,9};
        BuySellStock buySellStock = new BuySellStock();
        System.out.println(buySellStock.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;
        int minLeft = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){

            int cost = prices[i] - minLeft;

            if(cost > maxProfit){
                maxProfit = cost;
            }

            minLeft = Math.min(minLeft, prices[i]);
        }

        return maxProfit;
    }
}
