package com.talbn1.leetCode.arrays.failed;

import java.util.*;

/**
 * @author talbn on 12/20/2023
 **/
public class PalindromeNumber_9_acc_58 {
    
    public static void main(String[] args) {
        
        //System.out.println(isPalindrome(12221)); // Palindrome number
        //System.out.println("-------------------------------------------------");
       // System.out.println(isPalindrome(121)); // Palindrome number
        System.out.println("-------------------------------------------------");
        System.out.println(!isPalindrome(-121)); // Negative number, not a palindrome
/*        System.out.println("-------------------------------------------------");
        System.out.println(!isPalindrome(123)); // Not a palindrome
        System.out.println("-------------------------------------------------");
        System.out.println(isPalindrome(1)); // Single digit, palindrome
        System.out.println("-------------------------------------------------");
        System.out.println(isPalindrome(12321)); // Palindrome number
        System.out.println("-------------------------------------------------");
        System.out.println(isPalindrome(123321)); // Even length palindrome
        System.out.println("-------------------------------------------------");
        System.out.println(isPalindrome(0)); // Zero, palindrome
        System.out.println("-------------------------------------------------");
        System.out.println(!isPalindrome(1234567899)); // Large number, not a palindrome
        System.out.println("-------------------------------------------------");
        System.out.println(isPalindrome(123454321)); // La*/

    }
    
    
    public static boolean isPalindrome(int x) {
        
        int count = 0;
        ArrayList<Integer> solution = new ArrayList<>();
        while (x > 0){
            if (x%10 != 0) {
                solution.add(x%10);
                x=x/10;
                count++;
            }
        }

        System.out.println(solution);
        boolean isEven = solution.size() % 2 == 0;
        
        if (isEven){
            for (int i = 0; i < count/2; i++) {
                if(!Objects.equals(solution.get(i), solution.get(count -1 - i))){
                    return false;
                }
            }
        }else {
            for (int i = 0; i < count/2 -1; i++) {
                if(!Objects.equals(solution.get(i), solution.get(count -1 - i))){
                    return false;
                }
            }
        }
        return true;
    }
}
