package com.talbn1.leetCode.arrays.success;

//#Math

/**
 * @param x the integer to check
 *
 * @author talbn on 12/20/2023
 * This method checks if a given integer is a palindrome.
 * @return true if x is a palindrome, false otherwise
 **/
public class PalindromeNumber_9_acc_58 {
    
    public static void main(String[] args) {
        
/*        System.out.println(isPalindrome(10000021)); // NOT Palindrome number
        System.out.println("1 NOT Palindrome " +
                "number-------------------------------------------------");
                
        System.out.println(isPalindrome(10)); // NOT Palindrome number
        System.out.println("2 NOT Palindrome " +
                "number-------------------------------------------------");
                
        System.out.println(isPalindrome(12221)); // Palindrome number
        System.out.println("3 Palindrome number-------------------------------------------------");
        
        System.out.println(isPalindrome(12344321)); // Palindrome number
        System.out.println("4 Palindrome number-------------------------------------------------");
        
         System.out.println(isPalindrome(-121)); // Negative number, not a palindrome
       System.out.println("5 NOT Palindrome " +
               "number-------------------------------------------------");
               
        System.out.println(isPalindrome(123)); // Not a palindrome
        System.out.println("6 NOT Palindrome " +
                "number-------------------------------------------------");
                
        System.out.println(isPalindrome(1)); // Single digit, palindrome
        System.out.println("7 Palindrome number-------------------------------------------------");
        
        System.out.println(isPalindrome(12321)); // Palindrome number
        System.out.println("8 Palindrome number-------------------------------------------------");
        
        System.out.println(isPalindrome(123321)); // Even length palindrome
        System.out.println("9 Palindrome number-------------------------------------------------");
        
 */
        System.out.println(isPalindrome(0)); // Zero, palindrome
        System.out.println("10 Palindrome number-------------------------------------------------");
        
        System.out.println(isPalindrome(1234567899)); // Large number, not a palindrome
        System.out.println("11 NOT Palindrome " +
                "number-------------------------------------------------");
        
        System.out.println(isPalindrome(123454321)); // La
        System.out.println("12 Palindrome number-------------------------------------------------");
    }
    
    public static boolean isPalindrome(int x) {
        
        if (x < 0) return false;  // Negative numbers cannot be palindromes
        if (x < 10) return true;  // Single digit numbers are always palindromes
        
        // Count the number of digits in x
        int t = x;
        int size = 0;
        while (t >= 0) {
            if (t % 10 == 0 && t/10 == 0 && t != 0) {
                break;
            } else {
                size++;
                t = t / 10;
                if (t == 0) {
                    break;
                }
            }

        }
        if(size == 1) return true;

         int[] arr = new int[size];
        int temp = x;
        for (int i = 0; i < size; i++) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        
        int i = 0;
        int j = size - 1;
        if (size % 2 == 1) {
            while (i != j) {
                if (arr[i] == arr[j]) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        } else {
            if (size % 2 == 0 && arr[i] == arr[j]) {
                while (i <= j) {
                    if (arr[i] == arr[j]) {
                        i++;
                        j--;
                    } else {
                        return false;
                    }
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}