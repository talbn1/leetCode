package com.talbn1.leetCode.arrays.success;

import java.util.*;

//#Array
//#Hash Table
//#Sorting

class sort_array_by_increasing_frequency_1636_acc80 {
    
    public static void main(String[] args) {
         //System.out.println(Arrays.toString(frequencySort(new int[]{1,1,1,2,2,2,3,3,3,3,3,3})));
        // Output: [3,1,1,2,2,2]
         //System.out.println(Arrays.toString(frequencySort(new int[]{2,3,1,3,2}))); // Output: [1,
        // 3,3,2,2]
        //System.out.println(Arrays.toString(frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4,
        // 1}))); // Output: [5,-1,4,4,-6,-6,1,1,1]
        System.out.println(Arrays.toString(frequencySort(new int[]{5, 7, 1, 9, 3}))); // Output:// [9,7,5,3,1] (all have frequency 1, sorted in descending order)
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
        
        LinkedHashMap<Integer,Integer> numsMap = new LinkedHashMap<>();
        Integer[] boxedNumbers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers,Collections.reverseOrder());
        
        for (Integer boxedNumber : boxedNumbers) {
            if (numsMap.containsKey(boxedNumber)) {
                numsMap.put(boxedNumber, numsMap.get(boxedNumber) + 1);
            } else {
                numsMap.put(boxedNumber, 1);
            }
        }
        List<Integer> out = new ArrayList<>();
        while(!numsMap.isEmpty()){
            Map.Entry<Integer,Integer> entryMin =
                    numsMap.entrySet().stream().
                            min(Map.Entry
                                    .comparingByValue())
                            .orElse(null);
            for (int i = 0; i < Objects.requireNonNull(entryMin).getValue(); i++) {
                out.add(entryMin.getKey());
            }
            numsMap.remove(entryMin.getKey());
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
    
}