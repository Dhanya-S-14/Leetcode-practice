// LeetCode 169 - Majority Element
// Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, maj = 0;

        for (int num : nums) {
            if (count == 0) {
                maj = num;
                count = 1;
            } else if (maj == num) {
                count++;
            } else {
                count--;
            }
        }

        return maj;
    }
}