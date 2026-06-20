/*
Problem: 121. Best Time to Buy and Sell Stock
Difficulty: Easy

Runtime: 1 ms (Beats 99.94%)
Memory: 94.42 MB (Beats 50.19%)

Approach:
- Keep track of the minimum stock price seen so far.
- For each price, calculate the profit if sold on that day.
- Update the maximum profit whenever a better profit is found.
- Return the maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int max = 0;

        for (int price : prices) {

            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }

        return max;
    }
}