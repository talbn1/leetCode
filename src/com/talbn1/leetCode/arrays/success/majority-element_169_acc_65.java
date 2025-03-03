package com.talbn1.leetCode.arrays.success;//#Array
//#Hash Table
//#Divide and Conquer
//#Sorting
//#Counting
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

import java.util.*;

class Scratch {
    
    public static void main(String[] args) {
        
        // Expected: 2
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
//        // Expected: 5
        System.out.println(majorityElement(new int[]{5, 5, 5, 5, 1, 2, 5, 3, 5, 5, 5}));
//        // Expected: 1
        System.out.println(majorityElement(new int[]{1, 1, 2, 1, 3, 1, 1, 4, 1}));
//        // Expected: -1
        System.out.println(majorityElement(new int[]{-1, -1, -1, 2, 3, -1, 4, -1, -1}));
//        // Expected: 0
        System.out.println(majorityElement(new int[]{0, 0, 0, 1, 2, 0, 0}));
//        // Expected: 1000000000
        System.out.println(majorityElement(new int[]{1000000000, 1000000000, 2, 3, 1000000000, 1000000000, 1000000000}));
//        // Expected: -1000000000
        System.out.println(majorityElement(new int[]{-1000000000, -1000000000, -1000000000, 1, 2, -1000000000, -1000000000}));
//        // Expected: 7
        System.out.println(majorityElement(new int[]{7, 7, 7, 7, 7, 8, 7, 9, 7, 7, 7}));
//        // Expected: 4
        System.out.println(majorityElement(new int[]{4, 4, 4, 4, 4, 4, 4, 1, 2, 3, 4}));
    }
    
/*    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return counts.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(0);
    }*/
    
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(counts.containsKey(nums[i])){
                counts.put(nums[i], counts.get(nums[i]) + 1);
            }
            else {
                counts.put(nums[i], 1);
            }
        }
        
        return counts.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null).getKey();
    }
}