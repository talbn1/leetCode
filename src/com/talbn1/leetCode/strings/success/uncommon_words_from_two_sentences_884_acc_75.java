package com.talbn1.leetCode.strings.success;

//#Hash Table
//#String
//#Counting
import java.util.*;

/**
 * @author talbn on 3/4/2025
 **/
public class uncommon_words_from_two_sentences_884_acc_75 {
    
    public static void main(String[] args) {
        
        //  System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this " +
        //        "apple is sour"))); // Expected: [sweet, sour]
        //  System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana"))); //
        // Expected: [banana]
        System.out.println(Arrays.toString(uncommonFromSentences("hello world", "hello java"))); // Expected: [world, java]
        System.out.println(Arrays.toString(uncommonFromSentences("one two three", "four five six"))); // Expected: [one, two, three, four, five, six]
        System.out.println(Arrays.toString(uncommonFromSentences("a b c d", "c d e f"))); // Expected: [a, b, e, f]
        System.out.println(Arrays.toString(uncommonFromSentences("unique words here", "words unique not"))); // Expected: [here, not]
        System.out.println(Arrays.toString(uncommonFromSentences("the quick brown fox", "the quick blue fox"))); // Expected: [brown, blue]
        System.out.println(Arrays.toString(uncommonFromSentences("repeat repeat unique", "repeat different"))); // Expected: [unique, different]
        System.out.println(Arrays.toString(uncommonFromSentences("java is fun", "python is fun"))); // Expected: [java, python]
    }
    
    public static String[] uncommonFromSentences(String s1, String s2) {
        
        LinkedHashMap<String, Integer> freqMap = getStringIntegerLinkedHashMap(s1, s2);
        List<Map.Entry<String, Integer>> uniqeEntrys = freqMap.entrySet().
                stream()
                .filter(es -> es.getValue() == 1).toList();
        List<String> finalWords = new ArrayList<>();
        for (Map.Entry<String, Integer> uniqeEntry : uniqeEntrys) {
            finalWords.add(uniqeEntry.getKey());
        }
        String[] out = new String[uniqeEntrys.size()];
        for (int i = 0; i < finalWords.size(); i++) {
            out[i] = finalWords.get(i);
        }
        return out;
    }
    
    private static LinkedHashMap<String, Integer> getStringIntegerLinkedHashMap(String s1, String s2) {
        LinkedHashMap<String, Integer> freqMap = new LinkedHashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for (int i = 0; i < words1.length; i++) {
            if (freqMap.containsKey(words1[i])) {
                freqMap.put(words1[i], freqMap.get(words1[i]) + 1);
            } else {
                freqMap.put(words1[i], 1);
            }
        }
        for (int i = 0; i < words2.length; i++) {
            if (freqMap.containsKey(words2[i])) {
                freqMap.put(words2[i], freqMap.get(words2[i]) + 1);
            } else {
                freqMap.put(words2[i], 1);
            }
        }
        return freqMap;
    }
}
