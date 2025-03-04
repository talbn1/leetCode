package com.talbn1.leetCode.strings.success;

import java.util.*;

/**
 * @author talbn on 3/3/2025
 **/
public class valid_anagram_242_acc_66 {
    
    public static void main(String[] args) {
    
        String s = "anagram";
        System.out.println(isAnagram("anagram","nagaram"));
        
    }
    public static boolean isAnagram(String s, String t) {
        
        List<Character> s_sorted = s.chars().mapToObj(c -> (char) c).sorted().toList();
        List<Character> t_sorted = t.chars().mapToObj(c -> (char) c).sorted().toList();
        
        if (s_sorted.equals(t_sorted)) {
            return true;
        }
        return false;
    }
}
