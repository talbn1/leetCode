package com.talbn1.arrays;

/**
 * @author talbn on 6/15/2020
 **/
public class MaximumSubarray {

    /**
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6
     *
     *  * **/
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubarraySolution.maxSubArray(input));
    }
}
class MaximumSubarraySolution {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int [] table = new int[nums.length];
        table[0] = nums[0];
        for (int i=1 ; i<nums.length ; i++){
            table[i] = Math.max(nums[i],nums[i]+table[i-1]);
            max = Math.max(max,table[i]);
        }
        return max;
    }
}
