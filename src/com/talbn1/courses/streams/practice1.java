package com.talbn1.courses.streams;

import java.util.*;
import java.util.stream.*;

/**
 * @author talbn on 2/26/2025
 **/
public class practice1 {
    
    public static void main(String[] args) {
       
        //1	Filter and print all even numbers from a list	[1, 2, 3, 4, 5, 6]	2 4 6
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //numbers.stream().filter(num -> num%2 == 0).forEach(System.out::println);
        
        //2	Create and print a new list with squared numbers	[1, 2, 3, 4]	[1, 4, 9, 16]
        //List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6);
        //List<Integer> squares = numbers2.stream().map(num-> num*num).toList();
        //System.out.println(squares);
        
        //3	Calculate and print the sum of all numbers in a list   [1, 2, 3, 4, 5]	15
        //List<Integer> numbers3 = Arrays.asList(1,2,3,4,5,6);
        //int sum = numbers3.stream().reduce(0,(a,b) -> a+b);
        //System.out.println(sum); // Output: 15
        
        // 4 Convert each string to uppercase and print them["hello", "world", "java"]
        // HELLO WORLD JAVA
        
        //List<String> words = Arrays.asList("hello","world","java");
        //words = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        //System.out.println(words);
        
        // 5	Count strings starting with 'A' (case-insensitive)	["Apple", "Banana", "Avocado", "cherry"]	2
        //List<String> words2 = Arrays.asList("Apple", "Banana", "Avocado", "cherry");
        //Long count  =
         //       words2.stream().filter(word -> Character.toUpperCase(word.charAt(0)) == 'A')
        //       .count();
        //System.out.println(count);
        
        //6	    Filter and print all odd numbers from a list	[1, 2, 3, 4, 5, 6]	2 4 6
        //List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //List<Integer> out =
        //        numbers.stream().filter(num -> num%2 == 1).collect(Collectors.toList());
        //System.out.println(out);
        
        
//        7 	Filter and print all strings that start with 'J'	["Java", "Python", "JavaScript", "C++"]	Java JavaScript
//        8 	Filter and print all numbers greater than 10	[5, 15, 20, 10, 25]	15 20 25
//        9	    Create a new list with each number squared	[1, 2, 3, 4]	[1, 4, 9, 16]
//        10	Convert each string to uppercase and print them	["hello", "world", "java"]	HELLO WORLD JAVA
//        11	Double each number in the list and print the new list	[1, 2, 3, 4]	[2, 4, 6, 8]
//        12	Calculate and print the sum of all numbers in a list	[1, 2, 3, 4, 5]	15
//        13	Find and print the maximum number in a list	[1, 5, 3, 9, 2]	9
//        14	Concatenate all strings in a list and print the result	["hello", "world", "java"]	helloworldjava
//        15	Filter numbers greater than 5 and then square them	[1, 6, 3, 7, 2, 8]	36 49 64
//        16	Filter strings containing "java" and print their lengths	["java", "javascript", "python", "jvm"]	4 10
//        17	Map each number to its square and then find the sum	[1, 2, 3, 4]	30
//        18	Sort a list of numbers in ascending order and print	[4, 2, 9, 7, 5, 3]	2 3 4 5 7 9
//        19	Sort a list of strings by their length and print	["cat", "dog", "elephant", "bird"]	cat dog bird elephant
//        20	Sort a list of numbers in descending order and print	[4, 2, 9, 7, 5, 3]	9 7 5 4 3 2
//        21	Find and print the first string that starts with 'J'	["Python", "Java", "C++", "JavaScript"]	Java
//        22	Find and print the number of even numbers in a list	[1, 2, 3, 4, 5, 6]	3
//        23	Check if all numbers in a list are positive and print	[1, 2, 3, 4, 5]	true
//        24	Check if all numbers in a list are positive and print	[1, -2, 3, 4, 5]	false
//        25	Calculate and print the average of numbers in a list	[1, 2, 3, 4, 5]	3.0
//        26	Find and print the count of strings longer than 5	["hello", "world", "java", "programming"]	1
//        27	Find and print the minimum number in a list	[4, 2, 9, 7, 5, 3]	2
//        28	Convert all strings to lowercase and print them	["Hello", "World", "Java"]	hello world java
//        29	Filter and print strings that are palindromes	["radar", "hello", "level", "world"]	radar level
//        30	Find and print the second smallest number in a list	[4, 2, 9, 7, 5, 3]	3
//        31	Find and print the length of the longest string in a list	["apple", "banana", "cherry"]	6

        
        
        
    }
}
