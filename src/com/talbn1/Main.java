package com.talbn1;

import com.talbn1.objects.*;
import com.talbn1.solutions.linkedList.*;


public class Main {

    public static void main(String[] args) {
	

        /*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.*/
    
    
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
    
        ListNode l1a = new ListNode(2);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);
    
        l1.next = l1a; l1a.next = l1b; l1b.next = l1c;
    
    
        ListNode l2a = new ListNode(5);
        ListNode l2b = new ListNode(6);
        ListNode l2c = new ListNode(4);
    
        l2.next = l2a; l2a.next = l2b; l2b.next = l2c;
    
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1,l2);
    
    
    }
}
