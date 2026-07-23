package leetcode.topproblems.slidingwindow;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                continue;
            } else {
                minimum = Math.min(minimum, prices[i - 1]);
                ans = Math.max(ans, prices[i] - minimum);
            }
        }


        return ans;
    }

}
