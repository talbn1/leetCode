package com.talbn1.leetCode.strings;

/**
 * @author talbn on 10/7/2020
 **/
public class ReorderDataInLogFilesMAIN {
    
    public static void main(String[] args) {
        
        String[] logs = logs = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3" +
                " art zero"};
        
        ReorderDataInLogFiles reorderDataInLogFiles =
                new com.talbn1.leetCode.strings.ReorderDataInLogFiles();
        
        
        reorderDataInLogFiles.reorderLogFiles(logs);
    }
    
}
