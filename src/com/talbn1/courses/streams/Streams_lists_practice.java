package com.talbn1.courses.streams;

import com.talbn1.*;

import java.util.*;
import java.util.stream.*;

/**
 * @author talbn on 2/26/2025
 **/
public class Streams_lists_practice {
    
    public static void main(String[] args) {
        
        System.out.println("Problem 1");
        // 1. Filter and print all even numbers from a list
        // Non-terminal: filter()
        // Terminal: forEach()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        
        System.out.println("Problem 2");
        // 2. Create and print a new list with squared numbers
        // Non-terminal: map()
        // Terminal: toList()
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = numbers2.stream()
                .map(num -> num * num)
                .toList();
        System.out.println(squares);
        
        System.out.println("Problem 3");
        // 3. Calculate and print the sum of all numbers in a list
        // Non-terminal: none
        // Terminal: reduce()
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers3.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        
        System.out.println("Problem 4");
        // 4. Convert each string to uppercase and print them
        // Non-terminal: map()
        // Terminal: collect()
        List<String> words = Arrays.asList("hello", "world", "java");
        words = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(words);
        
        System.out.println("Problem 5");
        // 5. Count strings starting with 'A' (case-insensitive)
        // Non-terminal: filter()
        // Terminal: count()
        List<String> words2 = Arrays.asList("Apple", "Banana", "Avocado", "cherry");
        long count = words2.stream()
                .filter(word -> Character.toUpperCase(word.charAt(0)) == 'A')
                .count();
        System.out.println(count);
        
        System.out.println("Problem 6");
        // 6. Filter and print all odd numbers from a list
        // Non-terminal: filter()
        // Terminal: collect()
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> out = numbers4.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(out);
        
        System.out.println("Problem 7");
        // 7. Filter and print all strings that start with 'J'
        // Non-terminal: filter()
        // Terminal: collect()
        List<String> words3 = Arrays.asList("Java", "Python", "JavaScript", "C++");
        List<String> out2 = words3.stream()
                .filter(word -> word.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(out2);
        
        System.out.println("Problem 8");
        // 8. Filter and print all numbers greater than 10
        // Non-terminal: filter()
        // Terminal: collect()
        List<Integer> nums = Arrays.asList(5, 15, 20, 10, 25);
        List<Integer> out3 = nums.stream()
                .filter(num -> num > 10)
                .collect(Collectors.toList());
        System.out.println(out3);
        
        System.out.println("Problem 9");
        // 9. Create a new list with each number squared
        // Non-terminal: map()
        // Terminal: collect()
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squaredNums = nums2.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(squaredNums);
        
        System.out.println("Problem 10");
        // 10. Convert each string to uppercase and print them
        // Non-terminal: map()
        // Terminal: forEach()
        List<String> words4 = Arrays.asList("hello", "world", "java");
        words4.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
        
        System.out.println("Problem 11");
        // 11. Double each number in the list and print the new list
        // Non-terminal: map()
        // Terminal: collect()
        List<Integer> nums3 = Arrays.asList(1, 2, 3, 4);
        List<Integer> doubledNums = nums3.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(doubledNums);
        
        System.out.println("Problem 12");
        // 12. Calculate and print the sum of all numbers in a list
        // Non-terminal: mapToInt()
        // Terminal: sum()
        List<Integer> nums4 = Arrays.asList(1, 2, 3, 4, 5);
        int totalSum = nums4.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalSum);
        
        System.out.println("Problem 13");
        // 13. Find and print the maximum number in a list
        // Non-terminal: max()
        // Terminal: get()
        List<Integer> nums5 = Arrays.asList(1, 5, 3, 9, 2);
        Optional<Integer> maxNum = nums5.stream()
                .max(Integer::compareTo);
        System.out.println(maxNum.get());
        
        System.out.println("Problem 14");
        // 14. Concatenate all strings in a list and print the result
        // Non-terminal: collect()
        // Terminal: joining()
        List<String> words5 = Arrays.asList("hello", "world", "java");
        String combined = words5.stream()
                .collect(Collectors.joining());
        System.out.println(combined);
        
        System.out.println("Problem 15");
        // 15. Filter numbers greater than 5 and then square them
        // Non-terminal: filter(), map()
        // Terminal: collect()
        List<Integer> nums6 = Arrays.asList(1, 6, 3, 7, 2, 8);
        List<Integer> squaredFiltered = nums6.stream()
                .filter(num -> num > 5)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(squaredFiltered);
        
        System.out.println("Problem 16");
        // 16. Filter strings containing "java" and print their lengths
        // Non-terminal: filter(), map()
        // Terminal: collect()
        List<String> words6 = Arrays.asList("java", "javascript", "python", "jvm");
        List<Integer> javaLengths = words6.stream()
                .filter(word -> word.contains("java"))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(javaLengths);
        
        System.out.println("Problem 17");
        // 17. Map each number to its square and then find the sum
        // Non-terminal: map(), mapToInt()
        // Terminal: sum()
        List<Integer> nums7 = Arrays.asList(1, 2, 3, 4);
        int sumSquares = nums7.stream()
                .map(num -> num * num)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumSquares);
        
        System.out.println("Problem 18");
        // 18. Sort a list of numbers in ascending order and print
        // Non-terminal: sorted()
        // Terminal: collect()
        List<Integer> nums8 = Arrays.asList(4, 2, 9, 7, 5, 3);
        List<Integer> sortedNums = nums8.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNums);
        
        System.out.println("Problem 19");
        // 19. Sort a list of strings by their length and print
        // Non-terminal: sorted()
        // Terminal: collect()
        List<String> words7 = Arrays.asList("cat", "dog", "elephant", "bird");
        List<String> sortedWords = words7.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedWords);
        
        System.out.println("Problem 20");
        // 20. Sort a list of numbers in descending order and print
        // Non-terminal: sorted()
        // Terminal: collect()
        List<Integer> nums9 = Arrays.asList(4, 2, 9, 7, 5, 3);
        List<Integer> sortedDesc = nums9.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedDesc);
        
        System.out.println("Problem 21");
        // 21. Filter, map, sort, and collect numbers greater than 10 squared
        // Input: [5, 15, 25, 10, 30]
        // Expected Output: [225, 400, 900]
        // Non-terminal: filter(), map(), sorted()
        // Terminal: collect()
        List<Integer> nums10 = Arrays.asList(5, 15, 25, 10, 30);
        List<Integer> out4 = nums10.stream()
                        .filter(num-> num > 10)
                                .sorted()
                .map(num-> num*num).collect(Collectors.toList());
        System.out.println(out4);
        
        
        
        
        System.out.println("Problem 22");
        // 22. Convert words to uppercase, filter those starting with 'A', sort them, and join
        // Input: ["apple", "banana", "avocado", "cherry"]
        // Expected Output: "APPLE, AVOCADO"
        // Non-terminal: map(), filter(), sorted()
        // Terminal: collect(joining)
        
        List<String> furites = Arrays.asList("apple", "banana", "avocado", "cherry");
        List<String> out5 = furites.stream()
                        .filter(word -> word.startsWith("a"))
                                .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println(out5);
        System.out.println();
        
        

        System.out.println("Problem 24");
        // 24. Convert words to lowercase, remove duplicates, sort, and collect
        // Input: ["Java", "java", "Python", "python", "C++", "c++"]
        // Expected Output: ["c++", "java", "python"]
        // Non-terminal: map(), distinct(), sorted()
        // Terminal: collect()
        List<String> lang = Arrays.asList("Java", "java", "Python", "python", "C++", "c++");
        List<String> out6 = lang.stream()
                        .map(String::toLowerCase)
                                .distinct()
                                        .sorted()
                                                .collect(Collectors.toList());
        System.out.println(out6);
        
        
        
        System.out.println();
        System.out.println("Problem 25");
        // 25. Generate a sequence of numbers, filter primes, sort, and collect
        // Input: Range(1, 20)
        // Expected Output: [2, 3, 5, 7, 11, 13, 17, 19]
        // Non-terminal: filter(), sorted()
        // Terminal: collect()
        List<Integer> nums11 =
                (List<Integer>) IntStream.rangeClosed(1,20)
                        .filter(Streams_lists_practice::isPrime)
                        .boxed()
                                .sorted()
                                        .collect(Collectors.toList());
        
        System.out.println(nums11);
        
        
        System.out.println();
        System.out.println("Problem 26");
        // 26. Remove null values, filter non-empty strings, sort, and collect
        // Input: [null, "apple", "", "banana", " ", "cherry"]
        // Expected Output: ["apple", "banana", "cherry"]
        // Non-terminal: filter(), sorted()
        // Terminal: collect()
        
        List<String> fruites2 = Arrays.asList(null, "apple", "", "banana", " ", "cherry");
        List<String> fruitesOut2 = fruites2.stream().filter(Objects::nonNull)
                .filter(str -> !str.trim().isEmpty())
                        .sorted()
                .toList();
        System.out.println(fruitesOut2);
        
        System.out.println();
        System.out.println("Problem 27");
        // 27. Map numbers to their cubes, filter odd cubes, sort in descending order, and collect
        // Input: [1, 2, 3, 4, 5]
        // Expected Output: [27, 125]
        List<Integer> nums12 = Arrays.asList(1,2,3,4,5);
        List<Integer> out12 = nums12.stream().map(x -> x*x*x)
                        .filter(x -> x%2 != 0)
                                .sorted(Comparator.reverseOrder())
                                        .toList();
        System.out.println(out12);
        
        
        System.out.println();
        System.out.println("Problem 28");
        // 28. Find distinct words in a sentence, convert to uppercase, sort, and collect
        // Input: "Java is fun. Java is powerful."
        // Expected Output: ["FUN", "IS", "JAVA", "POWERFUL"]
        
        
        System.out.println("Problem 29");
        // 29. Generate Fibonacci sequence, filter even values, limit to 10, and collect
        // Input: First 20 Fibonacci numbers
        // Expected Output: [2, 8, 34, 144, 610]
        // Non-terminal: filter(), limit()
        // Terminal: collect()
        
        System.out.println("Problem 30");
        // 30. Convert a list of full names to initials, filter unique ones, sort, and collect
        // Input: ["John Doe", "Alice Bob", "Charlie Day"]
        // Expected Output: ["A.B", "C.D", "J.D"]
        // Non-terminal: map(), distinct(), sorted()
        // Terminal: collect()
        
        
        
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
    
    public static boolean isPrime(int num){
        if (num < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .allMatch(n -> num % n !=0);
        
    }
}
