/*
Problem: 349. Intersection of Two Arrays
Difficulty: Easy

Runtime: 2 ms (Beats 98.19%)
Memory: 44.77 MB (Beats 82.07%)

Approach:
- Store all elements of nums1 in a HashSet.
- Traverse nums2 and check if an element exists in the first set.
- Store common elements in another HashSet to avoid duplicates.
- Convert the result set into an array and return it.

Time Complexity: O(n + m)
Space Complexity: O(n)
git add .

*/

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            a.add(nums1[i]);
        }

        for (int num : nums2) {
            if (a.contains(num)) {
                b.add(num);
            }
        }

        int result[] = new int[b.size()];

        int m = 0;
        for (int nu : b) {
            result[m++] = nu;
        }

        return result;
    }
}