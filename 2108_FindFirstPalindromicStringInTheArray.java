/*
Problem: 2108. Find First Palindromic String in the Array
Difficulty: Easy

Runtime: 2 ms (Beats 59.62%)
Memory: 47.49 MB (Beats 70.19%)

Approach:
- Traverse each word in the array.
- Use two pointers to check whether the word is a palindrome.
- If a palindrome is found, return it immediately.
- If no palindrome exists, return an empty string.

Time Complexity: O(n × m)
where n = number of words, m = average length of a word

Space Complexity: O(1)

*/

class Solution {

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            String first = words[i];

            int j = 0;
            int k = first.length() - 1;

            boolean flag = true;

            while (j < k) {

                if (first.charAt(j) != first.charAt(k)) {
                    flag = false;
                    break;
                }

                j++;
                k--;
            }

            if (flag) {
                return first;
            }
        }

        return "";
    }
}