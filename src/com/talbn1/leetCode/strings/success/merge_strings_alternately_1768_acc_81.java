package com.talbn1.leetCode.strings.success;

//Two Pointers
//String

/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d*/

/**
 * @author talbn on 3/3/2025
 **/
public class merge_strings_alternately_1768_acc_81 {
    
    public static void main(String[] args) {
        
        System.out.println(mergeAlternately("cf", "eee")); //cefee
        System.out.println(mergeAlternately("abc", "pqr")); // Expected: apbqcr
        System.out.println(mergeAlternately("ab", "pqrs")); // Expected: apbqrs
        System.out.println(mergeAlternately("abcd", "pq")); // Expected: apbqcd
        System.out.println(mergeAlternately("x", "y")); // Expected: xy
        System.out.println(mergeAlternately("", "test")); // Expected: test
        System.out.println(mergeAlternately("hello", "world")); // Expected: hweolrllod
        System.out.println(mergeAlternately("abcde", "fgh")); // Expected: afbgchde
        System.out.println(mergeAlternately("123", "45678")); // Expected: 14253678
        System.out.println(mergeAlternately("java", "stream")); // Expected: jsatvreaam
        System.out.println(mergeAlternately("short", "loooooong")); // Expected: slhoorotooooong
        System.out.println(mergeAlternately("one", "two")); // Expected: otwnoe*/
    
    }
    
    public static String mergeAlternately(String word1, String word2) {
        
        int word1Size = word1.length();
        int word2Size = word2.length();
        StringBuilder out = new StringBuilder();
        int maxSize;
        
        if (word1Size == 0) return word2;
        if (word2Size == 0) return word1;
        
        maxSize = Math.max(word1Size, word2Size);
        
        for (int i = 0; i < maxSize; i++) {
            if (i < word1Size && i < word2Size) {
                out.append(word1.charAt(i));
                out.append(word2.charAt(i));
            } else if (i < word1Size && word2Size + word1Size > out.length()) {
                for (int j = i; j < word1Size; j++) {
                    out.append(word1.charAt(j));
                }
            } else if (i >= word1Size && word2Size + word1Size > out.length()) {
                for (int j = i; j < word2Size; j++) {
                    out.append(word2.charAt(j));
                }
            }
        }
        return out.toString();
    }
}
