package com.linkedList;

public class ArrayToLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 32, 43, 2, 324};
        ListNode head = createListFromArray(arr);

        printList(head);
    }

    private static ListNode createListFromArray(int[] arr) {
        if(arr == null || arr.length<1 )return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1; i<arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(ListNode head) {

        while(head != null){
            System.out.print(head.val + " ->");
            head = head.next;
        }
        System.out.println("null");
    }

}
