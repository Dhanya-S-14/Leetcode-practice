/*
Problem: 344. Reverse String
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 48.09 MB (Beats 87.29%)

Approach:
- Use two pointers:
  - Left pointer starts from the beginning.
  - Right pointer starts from the end.
- Swap characters at both pointers.
- Move left forward and right backward.
- Continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {

            char c = s[l];
            s[l] = s[r];
            s[r] = c;

            l++;
            r--;
        }
    }
}