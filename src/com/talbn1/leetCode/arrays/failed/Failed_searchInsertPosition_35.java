package com.talbn1.leetCode.arrays.failed;


// #Binary
// #twoPointers
// #Arrays



/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
 If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/

class Failed_searchInsertPosition_35 {
    
    
    
    public static void main(String[] args) {
        
        int [] example1 = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(example1,target));
        
        
    }
    
    public static int searchInsert(int[] nums, int target) {
        
        if (nums.length < 1) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        
        int middlePosition = 0;
        while (low <= high) {
            
            middlePosition = (low + high) / 2;
            int middleNumber = nums[middlePosition];
            
            if (target == middleNumber) {
                return middlePosition;
            }
            if (target < middleNumber) {
                high = middlePosition - 1;
            } else
                low = middlePosition + 1;
        }
        return middlePosition;
        
    }
}


/*
1[1,3,5,6]
 ^
t=7

[1, 3, 5, 6, 8, 10], target = 9
 ^  t=9?
 
//[1, 3, 5, 6, 7, 8, 10]
         ^
         
               nums[i] > 9  || nums[i] < 9
               
        
        
        
        
        */



























