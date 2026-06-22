// LeetCode 242 - Valid Anagram
// Difficulty: Easy
// Approach: Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int freq : count) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}