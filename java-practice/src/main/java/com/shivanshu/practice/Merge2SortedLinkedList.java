package com.shivanshu.practice;

public class Merge2SortedLinkedList {
    private static LinkedListNode mergeIterative(LinkedListNode head1 , LinkedListNode head2){

        if(head1 == null && head2 == null) return null;
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        LinkedListNode resultHead = null;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                resultHead = createMergedLinkedList(resultHead,head1.data);
                head1 = head1.next;
            }else{
                resultHead = createMergedLinkedList(resultHead,head2.data);
                head2 = head2.next;
            }
        }


        while (head1!=null){
            resultHead = createMergedLinkedList(resultHead,head1.data);
            head1 = head1.next;
        }


        while (head2!=null){
            resultHead = createMergedLinkedList(resultHead,head2.data);
            head2 = head2.next;
        }

        return resultHead;

    }

    private static LinkedListNode mergeRecursive(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode returnLinkedListNode = null;
        if (head1 == null && head2 != null)
            return head2;
        if (head2 == null && head1 != null)
            return head1;

        if (head1.data < head2.data) {
            returnLinkedListNode = head1;
            returnLinkedListNode.next = mergeRecursive(head1.next, head2);
        }
        if (head1.data > head2.data) {
            returnLinkedListNode = head2;
            returnLinkedListNode.next = mergeRecursive(head1, head2.next);
        }
        return returnLinkedListNode;
    }

    private static void diplayList(LinkedListNode head) {
        LinkedListNode current = head;
        System.out.print(" [ ");
        if (head != null) {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.print(" ]");
        } else {
            System.out.println("Linked list is empty.");
        }

    }

    private static LinkedListNode createMergedLinkedList(LinkedListNode resultHead, int data) {
        if(resultHead == null){
            resultHead = new LinkedListNode(data);
            return resultHead;
        }else {
            LinkedListNode temp = resultHead;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new LinkedListNode(data);
        }
        return resultHead;
    }

    public static void main(String[] args) {
        LinkedListNode head1 = null;
        LinkedListNode head2 = null;
        Merge2SortedLinkedList mll = new Merge2SortedLinkedList();
        /* First linked list fomation */
        LinkedListNode linkedListNode1 = new LinkedListNode(4);
        head1 = linkedListNode1;
        LinkedListNode linkedListNode2 = new LinkedListNode(5);
        LinkedListNode linkedListNode3 = new LinkedListNode(12);
        LinkedListNode linkedListNode4 = new LinkedListNode(24);
        LinkedListNode linkedListNode5 = new LinkedListNode(83);
        head1.next = linkedListNode2;
        head1.next.next = linkedListNode3;
        head1.next.next.next = linkedListNode4;
        head1.next.next.next.next = linkedListNode5;

        /* Second linked list fomation */
        LinkedListNode linkedListNode12 = new LinkedListNode(8);
        head2 = linkedListNode12;
        LinkedListNode linkedListNode22 = new LinkedListNode(9);
        LinkedListNode linkedListNode32 = new LinkedListNode(14);
        LinkedListNode linkedListNode42 = new LinkedListNode(21);
        LinkedListNode linkedListNode52 = new LinkedListNode(31);
        LinkedListNode linkedListNode62 = new LinkedListNode(132);
        LinkedListNode linkedListNode72 = new LinkedListNode(136);
        head2.next = linkedListNode22;
        head2.next.next = linkedListNode32;
        head2.next.next.next = linkedListNode42;
        head2.next.next.next.next = linkedListNode52;
        head2.next.next.next.next.next = linkedListNode62;
        head2.next.next.next.next.next.next = linkedListNode72;

        System.out.println("linked list-1 [4-->5-->12 -->24 -->83]\n"
                + "linked list-2 [8-->9-->14 --> 21 --> 31 -->132-->136]\n");
        System.out.print("Merged linkedlist using iterative appraoch : ");
        diplayList(mergeIterative(head1, head2));

        /* mark head1 = null */
        LinkedListNode head3 = null;
        System.out.print("\n\nMerged linkedlist iterative appraoch- "
                + "with only List2 has values: ");
        diplayList(mergeIterative(head3, head2));

        System.out.print("\n\nMerged linkedlist recursive appraoch- "
                + "with only List1 has values: ");
        diplayList(mergeRecursive(head1, head3));

        System.out.print("\n\nMerged linkedlist using recursive appraoch : ");
        diplayList(mergeRecursive(head1, head2));

    }
}
