package com.linkedList;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class PalindromeOrNotUsingStack {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(1);

        if (node == null || node.next == null) {
            System.out.println("Palindrome");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode mover = node;
        while (mover != null) {
            stack.push(mover.val);
            mover = mover.next;
        }

        ListNode check = node;
        while (check != null) {
            if (check.val != stack.pop()) {
                System.out.println("Not a palindrome");
                return;
            }
            check = check.next;
        }

        System.out.println("Palindrome");
    }
}
