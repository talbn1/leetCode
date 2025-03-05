package com.talbn1.leetCode.arrays.notStarted;

import java.util.*;

//#array
//#Hash Table
//#Sliding Window

class Scratch {
    
    /**
     * @author talbn on 04/02/2025

    
     * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
     * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
    
     * Example 1:
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     * Example 2:
     * Input: nums = [1,0,1,1], k = 1
     * Output: true
     * Example 3:
     * Input: nums = [1,2,3,1,2,3], k = 2
     * Output: false
     * Constraints:
     
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * 0 <= k <= 105
     *
     **/
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map <Integer,Integer> map = new HashMap<>();

        return false;
    }
}