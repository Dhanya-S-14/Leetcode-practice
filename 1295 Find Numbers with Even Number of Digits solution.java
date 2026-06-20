/*
Problem: 1295. Find Numbers with Even Number of Digits
Difficulty: Easy

Runtime: 1 ms (Beats 99.60%)
Memory: 44.40 MB (Beats 78.19%)

Approach:
- Traverse each number in the array.
- Count the number of digits using repeated division by 10.
- If the digit count is even, increment the answer count.
- Return the total count.

Time Complexity: O(n × d)
where d = number of digits in a number

Space Complexity: O(1)

*/

class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;

        for (int i : nums) {

            int d = 0;

            while (i > 0) {
                d++;
                i /= 10;
            }

            if (d % 2 == 0) {
                c++;
            }
        }

        return c;
    }
}