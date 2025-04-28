package top_interview_questions.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
    Contains Duplicate.

    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.

    Example:
    Input: nums = [1,2,3,1]
    Output: true
    Explanation:
    The element 1 occurs at the indices 0 and 3.
    */

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
