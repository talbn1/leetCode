package com.talbn1.leetCode.arrays.success;

import java.util.stream.IntStream;

//#Array
//#Two Pointers

/**
 * @author talbn on 12/27/2023
 **/
public class RemoveDuplicatesFromSortedArray26_acc_59 {
    
        public static void main(String[] args) {
            
            
            int[] input1 = {0,0,1,1,1,2,2,3,3,4};
            System.out.println(removeDuplicates(input1));
            /*
            
            // Test Case 1: Maximum Length with Minimum Value Repeated
// Expected Output: 1
            int[] input1 = new int[30000];
            Arrays.fill(input1, -100);
            System.out.println(removeDuplicates(input1));

// Test Case 2: Maximum Length with Maximum Value Repeated
// Expected Output: 1
            int[] input2 = new int[30000];
            Arrays.fill(input2, 100);
            System.out.println(removeDuplicates(input2));

// Test Case 3: Maximum Length with All Unique Elements
// Expected Output: 30000
            int[] input3 = IntStream.rangeClosed(-14999, 15000).toArray();
            System.out.println(removeDuplicates(input3));

// Test Case 4: Minimum Length with All Unique Elements
// Expected Output: 1
            int[] input4 = {50};
            System.out.println(removeDuplicates(input4));

// Test Case 5: Maximum Length with Alternating Values
// Expected Output: 2
            int[] input5 = new int[30000];
            for (int i = 0; i < input5.length; i++) {
                input5[i] = i % 2 == 0 ? 50 : 51;
            }
            System.out.println(removeDuplicates(input5));

// Test Case 6: Maximum Length with Gradual Increase
// Expected Output: 20
            int[] input6 = new int[30000];
            for (int i = 0; i < input6.length; i++) {
                input6[i] = i / 1500;
            }
            System.out.println(removeDuplicates(input6));

// Test Case 7: Maximum Length with Repeating Negative and Positive Values
// Expected Output: 2
            int[] input7 = new int[30000];
            for (int i = 0; i < input7.length; i++) {
                input7[i] = i % 2 == 0 ? -50 : 50;
            }
            System.out.println(removeDuplicates(input7));*/
        }
        
        public static int removeDuplicates(int[] nums) {
            int index=0;
            int[] copy = IntStream.of(nums).toArray();
            
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                    copy[index++] = nums[i];
                }
            }
            
            int count=0;
            for (int i = 0; i < copy.length-1; i++) {
                if (  !(nums[i] < nums[i+1]) ){
                    count ++;
                }
            }
            
            
            for (int i = 0; i < copy.length-1; i++) {
                System.out.print(copy[i]);
            }
            System.out.println(count);
            return count;
        }
}
