283. Move Zeroes

Runtime: 2 ms

Beats: 91.91%

Memory: 47.97 MB

Beats: 19.64%

Key Learning

Two-pointer technique helps perform the operation in-place.

Maintains the relative order of non-zero elements.

Efficient single-pass solution with constant extra space.

class Solution {

    public void moveZeroes(int[] nums) {

        int j = 0;



        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];

                nums[i] = nums[j];

                nums[j] = temp;

                j++;

            }

        }

    }

}