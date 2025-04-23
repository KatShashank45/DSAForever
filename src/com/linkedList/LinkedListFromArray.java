package com.linkedList;

public class LinkedListFromArray {

    public static void main(String[] args) {
        int arr[] = new int[]{2, 2, 23, 32, 324, 12, 124};
        ListNode head = convertToLL(arr);
        printList(head);
    }

    private static ListNode convertToLL(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new ListNode(arr[i]);
            mover = mover.next;
        }

        return head;
    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
