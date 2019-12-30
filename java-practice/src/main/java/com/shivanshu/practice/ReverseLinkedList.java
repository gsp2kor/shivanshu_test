package com.shivanshu.practice;

public class ReverseLinkedList {

    public static LinkedListNode reverseLinkedListInPlace(LinkedListNode head){

        LinkedListNode next;
        LinkedListNode temp = null;

        while(head != null){
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
         return temp;
    }

    public static LinkedListNode reverseLinkedListClone(LinkedListNode head){

        LinkedListNode revHead = null;
        LinkedListNode runner = head;

        while(runner != null){
            LinkedListNode temp = new LinkedListNode(runner.data);
            temp.next = revHead;
            revHead = temp;
            runner = runner.next;
        }
        return revHead;
    }
}
