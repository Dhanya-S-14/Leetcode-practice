/*
Problem: 1480. Running Sum of 1D Array
Difficulty: Easy
Runtime: 0 ms (Beats 100.00%)
Memory: 44.32 MB (Beats 34.58%)
Approach:
- Start from index 1.
- Add the previous element's running sum to the current element.
- Store the result in the same array (in-place).
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}