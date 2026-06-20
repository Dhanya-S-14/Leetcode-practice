/*
Problem: 167. Two Sum II - Input Array Is Sorted
Difficulty: Medium

Runtime: 2 ms (Beats 96.18%)
Memory: 48.39 MB (Beats 60.12%)

Approach:
- Use two pointers:
  - Left pointer starts at the beginning.
  - Right pointer starts at the end.
- Calculate the sum of the two elements.
- If the sum equals the target, return their 1-based indices.
- If the sum is smaller than the target, move the left pointer forward.
- If the sum is greater than the target, move the right pointer backward.

Time Complexity: O(n)
Space Complexity: O(1)

Submitted: Jun 16, 2026
*/

class Solution {
    public int[] twoSum(int[] num, int target) {

        int l = 0;
        int r = num.length - 1;

        while (l < r) {

            int cs = num[l] + num[r];

            if (cs == target) {
                return new int[]{l + 1, r + 1};
            }
            else if (cs < target) {
                l++;
            }
            else {
                r--;
            }
        }

        return new int[]{-1, -1};
    }
}