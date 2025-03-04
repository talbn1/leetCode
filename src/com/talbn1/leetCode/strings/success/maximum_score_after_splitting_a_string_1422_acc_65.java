package com.talbn1.leetCode.strings.success;

//String

/**
 * @author talbn on 3/4/2025
 **/
public class maximum_score_after_splitting_a_string_1422_acc_65 {
    
    public static void main(String[] args) {
        
        System.out.println(maxScore("01001")); // 4
      //  System.out.println(maxScore("11110000")); // Expected: 3
     /*   System.out.println(maxScore("0000")); // Expected: 3
        System.out.println(maxScore("00")); // Expected: 1
        System.out.println(maxScore("011101")); // Expected: 5
        System.out.println(maxScore("00111")); // Expected: 5
        System.out.println(maxScore("1111")); // Expected: 3
        System.out.println(maxScore("00001")); // Expected: 4
        System.out.println(maxScore("11000")); // Expected: 3
        System.out.println(maxScore("10101")); // Expected: 3
        System.out.println(maxScore("100011")); // Expected: 5
        System.out.println(maxScore("010101")); // Expected: 4
        System.out.println(maxScore("000111")); // Expected: 5
        System.out.println(maxScore("100100")); // Expected: 4
        System.out.println(maxScore("011000")); // Expected: 4*/
    }
    public static int maxScore(String s) {
        
        if (s.chars().filter(ch -> ch == '0').count() == s.length()) {
            return s.length() - 1;
        } else if (s.chars().filter(ch -> ch == '1').count() == s.length()) {
            return s.length() - 1;
        }
        long maxSum = 0;
        for (int i = 1; i < s.length() ; i++) {
            String group1 = s.substring(0, i);
            String group2 = s.substring(i);
            long countZeros = group1.chars().filter(ch -> ch == '0').count();
            long countOnes = group2.chars().filter(ch -> ch == '1').count();
            long sum = countZeros + countOnes;
            if (sum > maxSum) maxSum = sum;
        }
        return (int) maxSum;
    }
    
    
}
