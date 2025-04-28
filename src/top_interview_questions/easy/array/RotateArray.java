package top_interview_questions.easy.array;

import java.util.Arrays;

public class RotateArray {
    /*
    3. Rotate Array

    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    Example:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    */

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        int len = nums.length;

        for (int i = 0; i < k; i++) {
            result[i] = nums[len - k + i];
        }
        for (int i = 0; i < len - k; i++) {
            result[k + i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
