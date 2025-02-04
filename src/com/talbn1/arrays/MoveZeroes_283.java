package com.talbn1.arrays;

import java.util.*;

class MoveZeroes_283 {
    
    public static void main(String[] args) {
/*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array.
        
        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        
        Example 2:
        Input: nums = [0]
        Output: [0]

        int [] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);    */
        
/*        int [] nums1 = null;
        moveZeroes(nums1)*/
        ;
        
        int[] nums2 = {4, 2, 0, 1, 0, 3, 0};
        moveZeroes(nums2);
        
    }
    
    public static void moveZeroes(int[] nums) {
        int pointOne = 0;
        int pointTwo = 0;
        
        if (nums != null && nums.length > 1) {
            
            while (pointOne < nums.length - 2) {
                if (pointTwo < nums.length - 1) {
                    pointTwo = pointOne + 1;
                }
                
                if ((nums[pointOne] == 0) && (nums[pointTwo] != 0) ) {
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    int temp = nums[pointOne];
                    nums[pointOne] = nums[pointTwo];
                    
                    nums[pointTwo] = temp;
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    System.out.println("------------------------1-switch" +
                            "-------------------------------");
                } else if (nums[pointOne] == 0 && nums[pointTwo] == 0) {
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    // pointOne++;
                    pointTwo = pointOne + 1;
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    System.out.println("-------------------------2-nothing" +
                            "------------------------------");
                    
                }
                else if (nums[pointOne] == 0 && nums[pointTwo] == 0) {
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    pointTwo++;
                    System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
                    System.out.println(pointOne + "  " + pointTwo);
                    System.out.println("-------------------------2-nothing" +
                            "------------------------------");
                    
                }
               
            }
        } else if (nums != null) {
            System.out.println("[" + String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
        }
    }
}

/*
 * [0,1,0,3,12]  if (0 && next > 0 ) switch
 *  ^ |
 *
 * [1,0,0,3,12]
 *  ^   |
 * [1,0,0,3,12]
 *
 * [1,0,0,3,12]....
 *
 * [1,0,0,3,12] nothing
 *    ^ |
 * [1,0,0,3,12] switch and move first point to the next
 *    ^   |
 * [1,3,0,0,12]
 *
 * [1,3,0,0,12]
 *
 * [1,3,0,0,12] jump to the next non zero
 *
 * [1,3,0,0,12] nothing
 *      ^ |
 *
 * [1,3,12,0,0]
 *
 * */