package com.talbn1.arrays;

import java.util.*;

/**
 * @author talbn on 12/20/2023
 **/
public class TwoSum_1 {
    
    public static void main(String[] args) {
        // Test case 1
//        int[] nums1 = {2, 7, 11, 15};
  //      int target1 = 9;
    //    int[] expected1 = {0, 1};
      //  int[] results1 = twoSum(nums1, target1);
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        int[] results2 = twoSum(nums2, target2);
        
        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        int[] results3 = twoSum(nums3, target3);
        
        // Test case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 9;
        int[] expected4 = {3, 4};
        int[] results4 = twoSum(nums4, target4);
        
        // Test case 5
        int[] nums5 = {-1, -2, -3, -4, -5};
        int target5 = -8;
        int[] expected5 = {2, 4};
        int[] results5 = twoSum(nums5, target5);
        
        // Test case 6
        int[] nums6 = {0, 4, 3, 0};
        int target6 = 0;
        int[] expected6 = {0, 3};
        int[] results6 = twoSum(nums6, target6);
        
        int[] numsModerate = {-10, 21, 14, -5, 0, 15, 25, -3, 7, 8};
        int targetModerate = 22; // For example, sum of -10 and 32
        int[] expectedModerate = {0, 6}; // Indices of -10 and 32
        
        int[] resultsModerate = twoSum(numsModerate, targetModerate);
        checkResult(resultsModerate, expectedModerate);
        
        
        // Check results
       // checkResult(results1, expected1);
        checkResult(results2, expected2);
        checkResult(results3, expected3);
        checkResult(results4, expected4);
        checkResult(results5, expected5);
        checkResult(results6, expected6);
    }
    
    
    public static int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2];
        
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = 0; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target && i!= j){
                    solution[1]= j;
                    solution[0]= i;
                    return solution;
                }
            }
        }
        return new int[]{};
    }
    
    private static void checkResult(int[] results, int[] expected) {
        if (Arrays.equals(results, expected)) {
            System.out.println("Test passed: " + Arrays.toString(results));
        } else {
            System.out.println("Test failed: Expected " + Arrays.toString(expected) + ", but got " + Arrays.toString(results));
        }
    }
}
