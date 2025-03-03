package com.talbn1.leetCode.arrays.success;

//Array
//Hash Table
//Sorting

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.*;

/**
 * @author talbn on 3/2/2025
 **/
public class contains_duplicate_217_acc_62 {
    
    public static void main(String[] args) {
        
        System.out.println("Test Case 1: " + containsDuplicate(new int[]{1, 2, 3, 1})); // Expected: true
        System.out.println("Test Case 2: " + containsDuplicate(new int[]{1, 2, 3, 4})); // Expected: false
        System.out.println("Test Case 3: " + containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // Expected: true
        System.out.println("Test Case 4: " + containsDuplicate(new int[]{5, 6, 7, 8, 9})); // Expected: false
        System.out.println("Test Case 5: " + containsDuplicate(new int[]{10, 10, 20, 30, 40, 50})); // Expected: true
        System.out.println("Test Case 6: " + containsDuplicate(new int[]{100, 200, 300, 400, 500, 600, 700})); // Expected: false
        System.out.println("Test Case 7: " + containsDuplicate(new int[]{-1, -2, -3, -1})); // Expected: true
        System.out.println("Test Case 8: " + containsDuplicate(new int[]{0, 0, 0, 0})); // Expected: true
        System.out.println("Test Case 9: " + containsDuplicate(new int[]{99, 98, 97, 99, 96, 95})); // Expected: true
        System.out.println("Test Case 10: " + containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // Expected: false
        
    }
    
    public static  boolean containsDuplicate(int[] nums) {
        
        int sizeAfter = Arrays.stream(nums).distinct().toArray().length;
        if(nums.length == sizeAfter){
            return false;
        }else {
            return true;
        }
    }
}
