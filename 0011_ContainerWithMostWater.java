/*
Problem: 11. Container With Most Water
Difficulty: Medium

Runtime: 4 ms (Beats 94.24%)
Memory: 77.19 MB (Beats 84.23%)

Approach:
- Use two pointers:
  - Left pointer at the beginning.
  - Right pointer at the end.
- Calculate the area formed by the two lines:
  area = min(height[left], height[right]) * (right - left)
- Update the maximum area found.
- Move the pointer with the smaller height inward,
  since moving the taller line cannot increase the area.
- Continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {

    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int max = 0;

        while (l < r) {

            max = Math.max(
                max,
                Math.min(height[l], height[r]) * (r - l)
            );

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}