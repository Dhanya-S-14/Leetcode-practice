/*Problem: 1672. Richest Customer Wealth
Difficulty: Easy
Runtime: 0 ms (Beats 100.00%)
Memory: 44.12 MB (Beats 96.94%)
Approach:
- Traverse each customer's accounts.
- Calculate the total wealth of each customer.
- Keep track of the maximum wealth found.
Time Complexity: O(m × n)
Space Complexity: O(1)
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0;
        for(int i=0;i<n;i++){
         int sum1=0;
            for(int j=0;j<accounts[i].length;j++){
            sum1+=accounts[i][j];
        }
        if(sum1>max){
      max=sum1;
            }
        }
            return max;
                }
}
