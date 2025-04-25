package com.linkedList;

public class PrintingLinkedList {

    public static void printList(ListNode head) {

        while(head != null){
            System.out.print(head.val + " ->");
            head = head.next;
        }
        System.out.println("null");
    }
}
