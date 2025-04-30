package top_interview_questions.easy.dynamic_programming;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) {return  0;}
        if (nums.length == 1) {return nums[0];}
        if (nums.length == 2) {return Math.max(nums[0], nums[1]);}

        int prev1 = Math.max(nums[0], nums[1]);
        int prev2 = nums[0];
        int cur = 0;
        for (int i = 2; i < nums.length; i++) {
            cur = Math.max(prev1, prev2 + nums[i]); // i = 2

            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
}
