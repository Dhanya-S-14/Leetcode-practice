/*
Problem: 345. Reverse Vowels of a String
Difficulty: Easy

Runtime: 3 ms (Beats 75.64%)
Memory: 46.53 MB (Beats 65.71%)

Approach:
- Convert the string into a character array.
- Use two pointers:
  - Left pointer starts from the beginning.
  - Right pointer starts from the end.
- Move the left pointer until a vowel is found.
- Move the right pointer until a vowel is found.
- Swap the vowels and move both pointers.
- Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)

*/

class Solution {
    public String reverseVowels(String b) {

        int n = b.length();

        int l = 0, r = n - 1;

        String rev = "aeiouAEIOU";
        char ch[] = b.toCharArray();

        while (l < r) {

            if (rev.indexOf(ch[l]) == -1) {
                l++;
            }
            else if (rev.indexOf(ch[r]) == -1) {
                r--;
            }
            else {

                char er = b.charAt(l);

                ch[l] = ch[r];
                ch[r] = er;

                l++;
                r--;
            }
        }

        return new String(ch);
    }
}Reverse Vowels of a String solution