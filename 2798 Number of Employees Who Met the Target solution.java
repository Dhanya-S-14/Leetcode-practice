/*
Problem: 2798. Number of Employees Who Met the Target
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 44.10 MB (Beats 57.73%)

Approach:
- Traverse the hours array.
- Count employees whose working hours are greater than or equal to the target.
- Return the count.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int c = 0;

        for (int num : hours) {
            if (num >= target) {
                c++;
            }
        }

        return c;
    }
}