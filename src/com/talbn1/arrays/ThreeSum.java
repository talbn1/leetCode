package com.talbn1.arrays;

import java.util.*;

/**
 * @author talbn on 8/17/2020
 **/
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> rv = threeSum(nums);

        for (int i = 0; i < rv.size(); i++) {
            for (int j = 0; j < rv.get(i).size(); j++) {
                System.out.print(rv.get(i).get(j) + " ");

            }
            System.out.println("");
        }

                
    }


    public static List<List<Integer>> threeSum(int[] nums) {

        //nums

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, res);
            }
        return res;
    }

    static void twoSum(int[] nums, int i, List<List<Integer>> res) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int j = i + 1; j < nums.length; ++j) {
            int complement = -nums[i] - nums[j];
            if (seen.contains(complement)) {
                res.add(Arrays.asList(nums[i], nums[j], complement));
                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                    ++j;
            }
            seen.add(nums[j]);
        }
        System.out.println(seen);
    }


}
