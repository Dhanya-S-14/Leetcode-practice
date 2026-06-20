/*
Problem: 189. Rotate Array
Difficulty: Medium

Runtime: 0 ms (Beats 100.00%)
Memory: 61.34 MB (Beats 40.14%)

Approach:
- Rotation is performed using the Reversal Algorithm.
- First reverse the entire array.
- Then reverse the first k elements.
- Finally reverse the remaining n-k elements.
- This rotates the array to the right by k positions.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {

    public void reverse(int nums[], int s, int e) {

        while (s < e) {

            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);   // Reverse entire array
        reverse(nums, 0, k - 1);   // Reverse first k elements
        reverse(nums, k, n - 1);   // Reverse remaining elements
    }
}