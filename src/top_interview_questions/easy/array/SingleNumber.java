package top_interview_questions.easy.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    /*
    Given a non-empty array of integers nums,
    every element appears twice except for one.
    Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Example 1:
    Input: nums = [2,2,1]
    Output: 1
    */

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums) {
            if(map.get(num) == 1) {
                result = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
}
