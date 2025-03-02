package com.talbn1.courses.streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * @author talbn on 2/27/2025
 **/
public class Streams_hash_maps_practice {
    
    public static void main(String[] args) {
        
        System.out.println("Problem 46");
        // 46. Count character occurrences in a string using HashMap
        // Input: "banana"
        // Expected Output: {b=1, a=3, n=2}
        // Non-terminal: map(), collect()
        // Terminal: collect(Collectors.toMap())
        
        String banana = "banana";
        Map<Character, Long> charCount = banana.chars()
                        .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(),
                                        Collectors.counting()));
        System.out.println(charCount);
        
        
        System.out.println();
        System.out.println("Problem 47");
        // 47. Convert a list of words into a word-frequency map
        // Input: ["apple", "banana", "apple", "cherry", "banana", "banana"]
        // Expected Output: {apple=2, banana=3, cherry=1}
        // Non-terminal: collect(groupingBy())
        // Terminal: collect()
        
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "cherry", "banana",
                "banana");
        
        Map<String,Long> map =
                fruits.stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(map);
        
        
        System.out.println();
        System.out.println("Problem 48");
        // 48. Convert a list of names into a map with name lengths
        // Input: ["Alice", "Bob", "Charlie"]
        // Expected Output: {Alice=5, Bob=3, Charlie=7}
        // Non-terminal: collect(toMap())
        // Terminal: collect()
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<String,Integer> map2= names.stream()
                .collect(Collectors
                        .toMap(name -> name, String::length));
        System.out.println(map2);
        
        
        
        System.out.println("Problem 49");
        // 49. Group numbers by even and odd in a map
        // Input: [1, 2, 3, 4, 5, 6]
        // Expected Output: {even=[2, 4, 6], odd=[1, 3, 5]}
        // Non-terminal: collect(partitioningBy())
        // Terminal: collect()
        
        
        
        System.out.println("Problem 50");
        // 50. Create a map from a list of objects using a custom key extractor
        // Input: [{id=1, name=Alice}, {id=2, name=Bob}]
        // Expected Output: {1=Alice, 2=Bob}
        // Non-terminal: collect(toMap())
        // Terminal: collect()
        
        System.out.println("Problem 51");
        // 51. Convert a list of words into a map of first letters to words
        // Input: ["apple", "banana", "cherry", "avocado"]
        // Expected Output: {a=[apple, avocado], b=[banana], c=[cherry]}
        // Non-terminal: collect(groupingBy())
        // Terminal: collect()
        
        System.out.println("Problem 52");
        // 52. Find the maximum value in a map
        // Input: {Alice=85, Bob=92, Charlie=78}
        // Expected Output: Bob=92
        // Non-terminal: entrySet().stream().max()
        // Terminal: get()
        
        System.out.println("Problem 53");
        // 53. Find the minimum value in a map
        // Input: {Alice=85, Bob=92, Charlie=78}
        // Expected Output: Charlie=78
        // Non-terminal: entrySet().stream().min()
        // Terminal: get()
        
        System.out.println("Problem 54");
        // 54. Convert a map to a list of keys
        // Input: {Alice=85, Bob=92, Charlie=78}
        // Expected Output: [Alice, Bob, Charlie]
        // Non-terminal: keySet().stream()
        // Terminal: collect()
        
        System.out.println("Problem 55");
        // 55. Convert a map to a list of values
        // Input: {Alice=85, Bob=92, Charlie=78}
        // Expected Output: [85, 92, 78]
        // Non-terminal: values().stream()
        // Terminal: collect()
        
        System.out.println("Problem 56");
        // 56. Convert a list of numbers into a map with squares
        // Input: [1, 2, 3, 4]
        // Expected Output: {1=1, 2=4, 3=9, 4=16}
        // Non-terminal: collect(toMap())
        // Terminal: collect()
        
        System.out.println("Problem 57");
        // 57. Count the number of occurrences of each character in a string
        // Input: "hello"
        // Expected Output: {h=1, e=1, l=2, o=1}
        // Non-terminal: collect(toMap())
        // Terminal: collect()
        
        System.out.println("Problem 58");
        // 58. Merge two maps with summation
        // Input: {Alice=10, Bob=20}, {Alice=5, Bob=15, Charlie=10}
        // Expected Output: {Alice=15, Bob=35, Charlie=10}
        // Non-terminal: Stream.concat(), collect(toMap())
        // Terminal: collect()
        
        System.out.println("Problem 59");
        // 59. Find the most common character in a string
        // Input: "banana"
        // Expected Output: 'a' (appears most)
        // Non-terminal: collect(groupingBy(), maxBy())
        // Terminal: get()
        
        System.out.println("Problem 60");
        // 60. Convert a list of strings to a map with string lengths using computeIfAbsent
        // Input: ["apple", "banana", "cherry"]
        // Expected Output: {apple=5, banana=6, cherry=6}
        // Non-terminal: forEach(), computeIfAbsent()
        // Terminal: None (modifies map directly)
    }
    
    
}
