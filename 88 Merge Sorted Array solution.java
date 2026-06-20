/*
Problem: 88. Merge Sorted Array
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 43.75 MB (Beats 60.54%)

Approach:
- Use three pointers:
  - i points to the last valid element in nums1.
  - j points to the last element in nums2.
  - k points to the last position of nums1.
- Compare elements from the end and place the larger one at position k.
- Move the corresponding pointer backward.
- If elements remain in nums2, copy them into nums1.

Time Complexity: O(m + n)
Space Complexity: O(1)

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}