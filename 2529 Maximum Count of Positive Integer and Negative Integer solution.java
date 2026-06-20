/*
Problem: 2529. Maximum Count of Positive Integer and Negative Integer
Difficulty: Easy

Runtime: 1 ms (Beats 24.09%)
Memory: 46.90 MB (Beats 75.39%)

Approach:
- Traverse the array once.
- Count negative numbers.
- Count positive numbers.
- Ignore zeros.
- Return the maximum of the two counts.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int maximumCount(int[] nums) {

        int cn = 0, c = 0;

        for (int num : nums) {

            if (num < 0) {
                cn++;
            }
            else if (num == 0) {
                continue;
            }
            else {
                c++;
            }
        }

        int ans = Math.max(c, cn);
        return ans;
    }
}