package com.talbn1.leetCode.arrays.success;

import java.util.*;

//#Array

class move_zeroes_283_acc_62 {
    
    public static void main(String[] args) {
        
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Expected: [1, 3, 12, 0, 0]
        
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Expected: [0]
        
        int[] nums3 = {1, 0, 2, 0, 3, 0, 4};
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3)); // Expected: [1, 2, 3, 4, 0, 0, 0]
        
        int[] nums4 = {0, 0, 0, 1};
        moveZeroes(nums4);
        System.out.println(Arrays.toString(nums4)); // Expected: [1, 0, 0, 0]
        
        int[] nums5 = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(nums5);
        System.out.println(Arrays.toString(nums5)); // Expected: [4, 2, 4, 3, 5, 1, 0, 0, 0, 0]
        
        int[] nums6 = {0, 0, 0, 0};
        moveZeroes(nums6);
        System.out.println(Arrays.toString(nums6)); // Expected: [0, 0, 0, 0]
        
        int[] nums7 = {1, 2, 3, 4, 5};
        moveZeroes(nums7);
        System.out.println(Arrays.toString(nums7)); // Expected: [1, 2, 3, 4, 5]
        
        int[] nums8 = {0, 0, 1, 0, 0, 2, 3};
        moveZeroes(nums8);
        System.out.println(Arrays.toString(nums8)); // Expected: [1, 2, 3, 0, 0, 0, 0]
        
        int[] nums9 = {1, 0, 0, 2, 3, 4, 0, 0};
        moveZeroes(nums9);
        System.out.println(Arrays.toString(nums9)); // Expected: [1, 2, 3, 4, 0, 0, 0, 0]
        
        int[] nums10 = {2, 1};
        moveZeroes(nums10);
        System.out.println(Arrays.toString(nums10)); // Expected: [2, 1]
    }
    
    public static void moveZeroes(int[] nums) {
        
        int zeros = 0;
        List<Integer> numsNoZeros = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            else{
                numsNoZeros.add(nums[i]);
            }
        }
        for (int i = 0; i < zeros; i++) {
            numsNoZeros.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsNoZeros.get(i);
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
/*
* int pointOne = 0;
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
* */