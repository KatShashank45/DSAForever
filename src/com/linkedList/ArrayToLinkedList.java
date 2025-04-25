package com.linkedList;

public class ArrayToLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 32, 43, 2, 324};
        ListNode head = createListFromArray(arr);

        PrintingLinkedList.printList(head);
    }

    public static ListNode createListFromArray(int[] arr) {
        if(arr == null || arr.length<1 )return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1; i<arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }



}
