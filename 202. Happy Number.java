/*
Problem: 202. Happy Number
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 42.16 MB (Beats 88.47%)

Approach:
- Repeatedly replace the number with the sum of squares of its digits.
- If the number becomes 1 → it is a Happy Number.
- If the number enters a cycle (detected using 4) → it is not a Happy Number.
- Use a helper function to compute digit-square sum.

Key Insight:
- All non-happy numbers eventually enter a cycle containing 4.

Time Complexity: O(log n × number of iterations)
Space Complexity: O(1)
*/

class Solution {

    public static int check(int n){
        int sq = 0;
        while(n > 0){
            int temp = n % 10;
            sq += temp * temp;
            n /= 10;
        }
        return sq;
    }

    public boolean isHappy(int n) {

        boolean ans = false;

        if(n == 1 || n == 7){
            ans = true;
        }
        else if(n >= 0 && n <= 9){
            ans = false;
        }
        else if(n < 0){
            ans = false;
        }
        else {
            while(n != 1 && n != 4){
                n = check(n);
            }

            if(n == 1){
                ans = true;
            } else {
                ans = false;
            }
        }

        return ans;
    }
}