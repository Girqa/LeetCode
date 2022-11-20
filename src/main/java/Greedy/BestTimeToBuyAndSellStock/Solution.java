package Greedy.BestTimeToBuyAndSellStock;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.maxProfit(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(s.maxProfit(new int[]{5, 3, 2, 1, 0}));
        System.out.println(s.maxProfit(new int[]{5, 3, 7, 1, 4, 2, 8}));
    }

    public int maxProfit(int[] prices) {
        int curMin = prices[0], maxDelta = 0;
        for (int price: prices) {
            if (price - curMin > maxDelta) {
                maxDelta = price - curMin;
            }
            if (curMin > price) {
                curMin = price;
            }
        }
        return maxDelta;
    }
}
