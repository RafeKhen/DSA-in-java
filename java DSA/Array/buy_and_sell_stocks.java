public class buy_and_sell_stocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {                     // profit
                int profit = prices[i] - buyPrice;          // today's price
                maxProfit = Math.max(maxProfit, profit);     // max profit

                System.out.println("Buying price "+ buyPrice+" Selling price "+prices[i]+"\tProfit = "+ profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};              // big O(n)
        System.out.println("\nMax profit is: "+ buyAndSellStocks(prices));
    }
}
