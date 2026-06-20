/*
Problem: 151. Reverse Words in a String
Difficulty: Medium

Runtime: 8 ms (Beats 36.23%)
Memory: 44.12 MB (Beats 79.48%)

Approach:
- Remove leading and trailing spaces using trim().
- Split the string into words using "\\s+".
- Reverse the array of words using two pointers.
- Join the words with a single space.
- Return the resulting string.

Time Complexity: O(n)
Space Complexity: O(n)

*/

class Solution {

    public String reverseWords(String s) {

        String arr[] = s.trim().split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            String a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;

            i++;
            j--;
        }

        String ans = String.join(" ", arr);

        return ans;
    }
}