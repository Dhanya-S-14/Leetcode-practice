/*
Problem: 258. Add Digits
Difficulty: Easy

Runtime: 1 ms (Beats 98.13%)
Memory: 42.56 MB (Beats 62.29%)

Approach:
- Repeatedly calculate sum of digits of the number.
- Continue until the number becomes a single digit.
- Return the final single digit.

Key Idea:
- Keep reducing number using digit-sum until num < 10.

Time Complexity: O(log n × number of reductions)
Space Complexity: O(1)
*/

class Solution {

    // Function to calculate sum of digits
    public static int check(int num){
        int add = 0;

        while(num > 0){
            int temp = num % 10;
            add += temp;
            num /= 10;
        }

        return add;
    }

    public int addDigits(int num) {

        // already single digit
        if(num >= 0 && num <= 9){
            return num;
        }

        // repeat until single digit
        while(num >= 10){
            num = check(num);
        }

        return num;
    }
}