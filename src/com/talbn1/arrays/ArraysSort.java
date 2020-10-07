package com.talbn1.arrays;

/**
 * @author talbn on 6/15/2020
 **/
public class ArraysSort {
    public static void main(String[] args) {
        int[] input = {9,5,8,4,3,2,7};
        //bubbleSortSolution.sort(input);
        insertionSort.sort(input);
    }
}

class bubbleSortSolution{
    public static void sort(int[] input) {
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i + 1] < input[i]) {
                    int tempi = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = tempi;
                    fixed = false;
                }
            }
        }
        for (int i = 0 ; i < input.length-1 ; i++){
            System.out.print(input[i]);
        }
    }
}

class insertionSort{
    public static void sort(int[] input) {
        int i,j,key,temp;
        //{9,5,8,4,3,2,7};
        for (i = 1; i <input.length ; i++) {

            key = input[i];
            j = i-1;
            while (j>=0 && key<input[j]){
                temp = input[j];
                input[j] = input[j+1];
                input[j+1] = temp;
                j--;
            }
        }
        for (int k = 0; k < input.length ; k++) {
            System.out.print(input[k] + " ,");
        }
    }
}


