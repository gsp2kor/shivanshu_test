package com.shivanshu.practice;

public class AddNumberRepresentedByLinkedList {

    private static LinkedListNode addNumberRepresentedByLinkedList(LinkedListNode head1, LinkedListNode head2) {
        if (head1 == null && head2 == null) return new LinkedListNode(0);
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        int remainder = 0;
        LinkedListNode result = null;
        LinkedListNode pointer = null;
        LinkedListNode temp;
        while (head1 != null || head2 != null) {
            int val = (head1 != null ? head1.data : 0) + (head2 != null ? head2.data : 0);
            if (val + remainder >= 10) {
                val = val % 10;
                remainder = 1;
            } else {
                remainder = 0;
            }

            temp = new LinkedListNode(val);

            if (result == null) {
                result = temp;
                pointer = temp;
            } else {
                pointer.next = temp;
                pointer = pointer.next;
            }

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

        if (remainder > 0) {
            temp = new LinkedListNode(remainder);
            pointer.next = temp;
        }
        return result;
    }
}
