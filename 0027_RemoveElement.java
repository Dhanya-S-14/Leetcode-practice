/*
Problem: 27. Remove Element
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 43.28 MB (Beats 89.48%)

Approach:
- Use a pointer `index` to track the position of valid elements.
- Traverse the array.
- If the current element is not equal to `val`, place it at `nums[index]`.
- Increment `index`.
- After traversal, `index` represents the new length of the array.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {

    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}