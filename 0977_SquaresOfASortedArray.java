/*
Problem: 977. Squares of a Sorted Array
Difficulty: Easy

Runtime: 1 ms (Beats 100.00%)
Memory: 47.27 MB (Beats 64.05%)

Approach:
- Use two pointers:
  - Left pointer at the beginning.
  - Right pointer at the end.
- Compare the absolute values at both ends.
- Place the larger square at the current position from the end of the result array.
- Move the corresponding pointer.
- Continue until all positions are filled.

Time Complexity: O(n)
Space Complexity: O(n)

*/

class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int i = 0;
        int j = n - 1;

        for (int p = n - 1; p >= 0; p--) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[p] = nums[i] * nums[i];
                i++;
            } else {
                res[p] = nums[j] * nums[j];
                j--;
            }
        }

        return res;
    }
}