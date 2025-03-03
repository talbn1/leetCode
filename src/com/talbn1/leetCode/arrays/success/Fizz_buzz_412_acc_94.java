package com.talbn1.leetCode.arrays.success;

import java.util.*;
import java.util.stream.*;

/**
 * @author talbn on 2/27/2025
 **/
public class Fizz_buzz_412_acc_94 {
    
    public static void main(String[] args) {
        
        System.out.println(fizzBuzz(1));   // Expected output: ["1"]
        System.out.println(fizzBuzz(2));   // Expected output: ["1", "2"]
        System.out.println(fizzBuzz(3));   // Expected output: ["1", "2", "Fizz"]
        System.out.println(fizzBuzz(5));   // Expected output: ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(fizzBuzz(15));  // Expected output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
        System.out.println(fizzBuzz(10));  // Expected output: ["1", "2", "Fizz", "4", "Buzz","Fizz", "7", "8", "Fizz", "Buzz"]
    }
    
    public static List<String> fizzBuzz(int n) {
        
        List<String> out = IntStream.rangeClosed(1,n)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        
        for (int i = 0; i < n; i++) {
            int num = i + 1; // 1-based index
            if (num % 15 == 0) {
                out.set(i, "FizzBuzz");
            } else if (num % 3 == 0) {
                out.set(i, "Fizz");
            } else if (num % 5 == 0) {
                out.set(i, "Buzz");
            }
        }
        return out;
    }
    
}
/*        Integer[] sequence = IntStream.rangeClosed(1, n).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(sequence);
        
        list.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .map()
        */