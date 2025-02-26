package com.talbn1;

import com.talbn1.leetCode.arrays.notStarted.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        mergeStoredArray();
    }
    
    private static void mergeStoredArray(){
        
        // Test Case 3
        int[] nums1_3 = {1, 2, 3, 0, 0, 0};
        int[] nums2_3 = {};
        int m3 = 3;
        int n3 = 0;
        int[] expected3 = {1, 2, 3}; // Expected output
        MergeSortedArray_88 mergeSortedArray88_3 = new MergeSortedArray_88();
        mergeSortedArray88_3.merge(nums1_3, m3, nums2_3, n3);
        System.out.println(Arrays.equals(nums1_3, expected3)); // Should print true if the output matches the expected
        
        // Test Case 4
        int[] nums1_4 = {1, 2, 2, 0, 0, 0};
        int[] nums2_4 = {2, 3, 4};
        int m4 = 3;
        int n4 = 3;
        int[] expected4 = {1, 2, 2, 2, 3, 4}; // Expected output
        MergeSortedArray_88 mergeSortedArray88_4 = new MergeSortedArray_88();
        mergeSortedArray88_4.merge(nums1_4, m4, nums2_4, n4);
        System.out.println(Arrays.equals(nums1_4, expected4)); // Should print true if the output matches the expected
        
        // Test Case 5
        int[] nums1_5 = {-3, -1, 2, 0, 0, 0};
        int[] nums2_5 = {-2, 0, 3};
        int m5 = 3;
        int n5 = 3;
        int[] expected5 = {-3, -2, -1, 0, 2, 3}; // Expected output
        MergeSortedArray_88 mergeSortedArray88_5 = new MergeSortedArray_88();
        mergeSortedArray88_5.merge(nums1_5, m5, nums2_5, n5);
        System.out.println(Arrays.equals(nums1_5, expected5)); // Should print true if the output matches the expected
        
        // Test Case 6
        int[] nums1_6 = {0, 1, 3, 0, 0, 0};
        int[] nums2_6 = {0, 2, 4};
        int m6 = 3;
        int n6 = 3;
        int[] expected6 = {0, 0, 1, 2, 3, 4}; // Expected output
        MergeSortedArray_88 mergeSortedArray88_6 = new MergeSortedArray_88();
        mergeSortedArray88_6.merge(nums1_6, m6, nums2_6, n6);
        System.out.println(Arrays.equals(nums1_6, expected6)); // Should print true if the output matches the expected
        
        // Test Case 7
        int[] nums1_7 = {1, 0, 0, 0, 0, 0};
        int[] nums2_7 = {2};
        int m7 = 1;
        int n7 = 1;
        int[] expected7 = {1, 2}; // Expected output
        MergeSortedArray_88 mergeSortedArray88_7 = new MergeSortedArray_88();
        mergeSortedArray88_7.merge(nums1_7, m7, nums2_7, n7);
        System.out.println(Arrays.equals(nums1_7, expected7)); // Should print true if the output matches the expected
    }
}
