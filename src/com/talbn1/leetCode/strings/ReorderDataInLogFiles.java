package com.talbn1.leetCode.strings;

/**
 * @author talbn on 10/7/2020
 **/
public class ReorderDataInLogFiles {
    
    public String[] reorderLogFiles(String[] logs) {
        
        java.util.Arrays.sort(logs, (log1, log2) -> {
            int index1 = log1.indexOf(" ");
            String id1 = log1.substring(0, index1);
            String main1 = log1.substring(index1 + 1);
            
            int index2 = log2.indexOf(" ");
            String id2 = log2.substring(0, index2);
            String main2 = log2.substring(index1 + 2);
            
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));
            
            //if both are letters
            if (!isDigit1 && !isDigit2) {
                int value = main1.compareTo(main2);
                // if value = 0, means that the bodies are identical
                if (value == 0) {
                    //sort by id
                    return id1.compareTo(id2);
                }
                //return -1 or 1
                return value;
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }
    
}
