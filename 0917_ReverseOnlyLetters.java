/*
Problem: 917. Reverse Only Letters
Difficulty: Easy

Runtime: 0 ms (Beats 100.00%)
Memory: 42.56 MB (Beats 94.90%)

Approach:
- Convert the string into a character array.
- Use two pointers:
  - Left pointer starts from the beginning.
  - Right pointer starts from the end.
- If the left character is not a letter, move left forward.
- If the right character is not a letter, move right backward.
- Otherwise, swap the two letters and move both pointers.
- Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)

Submitted: Jun 17, 2026
*/

class Solution {
    public String reverseOnlyLetters(String s) {

        int i = 0, j = s.length() - 1;

        char ch[] = s.toCharArray();

        while (i < j) {

            if (!Character.isLetter(ch[i])) {
                i++;
            }
            else if (!Character.isLetter(ch[j])) {
                j--;
            }
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

        return new String(ch);
    }
}