package com.talbn1.leetCode.arrays.failed;

import java.util.*;

class RankTransformOfAnArray1331acc70 {
    
    /**
     * @author talbn on 04/02/2025
     * <p>
     * #array #Hash Table #Sorting
     * <p>
     * 1331. Rank Transform of an Array
     * <p>
     * The rank represents how large the element is. The rank has the following rules:
     * <p>
     * Rank is an integer starting from 1.
     * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
     * Rank should be as small as possible.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [40,10,20,30]
     * Output: [4,1,2,3]
     * Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
     * Example 2:
     * <p>
     * Input: arr = [100,100,100]
     * Output: [1,1,1]
     * Explanation: Same elements share the same rank.
     * Example 3:
     * <p>
     * Input: arr = [37,12,28,9,100,56,80,5,12]
     * Output: [5,3,4,2,8,6,7,1,3]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= arr.length <= 105
     * -109 <= arr[i] <= 109
     **/
    
    public static void main(String[] args) {
        
       // int[] arr = {40,10,20,30};
       // arrayRankTransform(arr);
        
        int[] arr2 = {37,12,28,9,100,56,80,5,12}; // Output: [5,3,4,2,8,6,7,1,3]
        arrayRankTransform(arr2);
    }
    
    public static int[] arrayRankTransform(int[] arr) {
        
        List<Integer> orgList = Arrays.stream(arr).boxed().toList();
        List<Integer> sortedList = Arrays.stream(arr).sorted().boxed().toList();
        //List<Integer> output = new ArrayList<>();
        Set<Integer> set = new HashSet<>(orgList);
        int[] sortedPositions = new int[arr.length];
        
        
        for (int i = 0; i < arr.length; i++) {
            int sortedIndex = sortedList.indexOf(i); // Find index in sorted list
            
         //   sortedPositions[i] = .sortedList(arr[i]);
        }
        /*
        
        [37][12][28][9][100][56][80][5][12]
          |
        [ask about 37 what is the where is it located in the highrachy][][][][][][][][]
         |
         find this index

        [5,3,4,2,8,6,7,1,3]
        
          //[5][9][12][12][28][37][56][80][100]
         */
        
        
        printArray(arr);
        return arr;
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
//`