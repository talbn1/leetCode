package com.talbn1.leetCode.arrays.failed;

import java.util.*;

class SortArrayByIncreasingFrequency {
    
    /**
     * 05/02/25
     * <p>
     * Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
     * If multiple values have the same frequency, sort them in decreasing order.
     * <p>
     * Return the sorted array.
     * Example 1:
     * <p>
     * Input: nums = [1,1,2,2,2,3]
     * Output: [3,1,1,2,2,2]
     * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
     * Example 2:
     * <p>
     * Input: nums = [2,3,1,3,2]
     * Output: [1,3,3,2,2]
     * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
     * Example 3:
     * <p>
     * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
     * Output: [5,-1,4,4,-6,-6,1,1,1]
     */
    
    public static void main(String[] args) {
        
        // System.out.println(Arrays.toString(frequencySort(new int[]{1,1,1,2,2,2,3,3,3,3,3,3}))); //
        // Output: [3,1,1,2,2,2]
        // System.out.println(Arrays.toString(frequencySort(new int[]{2,3,1,3,2}))); // Output: [1,
        // 3,3,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}))); // Output: [5,-1,4,4,-6,-6,1,1,1]
       /* System.out.println(Arrays.toString(frequencySort(new int[]{5, 7, 1, 9, 3}))); // Output:
        [9,7,5,3,1] (all have frequency 1, sorted in descending order)
        System.out.println(Arrays.toString(frequencySort(new int[]{4, 4, 2, 2, 3, 3, 1, 1, 5}))); // Output: [5,1,1,3,3,2,2,4,4]
        System.out.println(Arrays.toString(frequencySort(new int[]{-2, -2, -3, -3, -3, -1, -1, -1, -1}))); // Output: [-3,-3,-3,-2,-2,-1,-1,-1,-1]
        System.out.println(Arrays.toString(frequencySort(new int[]{5, -1, 4, -1, -6, 4, 5, -6, -6}))); // Output: [5,5,4,4,-1,-1,-6,-6,-6]
        System.out.println(Arrays.toString(frequencySort(new int[]{8, 6, 5, 9, 7}))); // Output: [9,8,7,6,5] (all have frequency 1, sorted in descending order)
        System.out.println(Arrays.toString(frequencySort(new int[]{2, 2, 3, 3, 3, 4, 4, 4, 4}))); // Output: [2,2,3,3,3,4,4,4,4] (sorted by frequency, then descending order)
        System.out.println(Arrays.toString(frequencySort(new int[]{10, 10, 20, 20, 20, 30, 30, 30, 30, 40}))); // Output: [40,10,10,20,20,20,30,30,30,30]
        System.out.println(Arrays.toString(frequencySort(new int[]{100, 50, 50, 25, 25, 25, 10}))); // Output: [100,10,50,50,25,25,25]
        System.out.println(Arrays.toString(frequencySort(new int[]{-5, -10, -5, -10, -5, -1}))); // Output: [-1,-10,-10,-5,-5,-5]
        System.out.println(Arrays.toString(frequencySort(new int[]{0, 0, 1, 1, 1, 2, 2, 2, 2}))); // Output: [0,0,1,1,1,2,2,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[]{100, 200, 300, 200, 100, 400, 500}))); // Output: [400,500,300,200,200,100,100]
        System.out.println(Arrays.toString(frequencySort(new int[]{9, 9, 8, 8, 8, 7, 7, 7, 7}))); // Output: [9,9,8,8,8,7,7,7,7] */
        
    }
    
    public static int[] frequencySort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1) {
            return nums;
        }
        
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        int[] sol = new int[nums.length];
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
        sortedEntries.sort((a, b) -> {
            int freqA = a.getValue();
            int freqB = b.getValue();
            return (freqA == freqB) ? Integer.compare(b.getKey(), a.getKey()) : Integer.compare(freqA, freqB);
        });
        
        
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            for (int i = 0; i < entry.getValue(); i++) {
                sol[index++] = entry.getKey();
            }
        }
        int[] output = {5, -1, 4, 4, -6, -6, 1, 1, 1};
        printArray(output);
        return sol;
    }
    
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}