package LinkedList.Cicle;

import LinkedList.MiddleElement.ListNode;
import LinkedList.MiddleElement.Solution;

public class Circle extends Solution {
    public static void main(String[] args) {
        Circle c = new Circle();
        ListNode head = Circle.list(2);
        System.out.println(c.detectCycle(head));
    }

    public ListNode detectCycle(ListNode head) {
        // Pointer's intialize at head of linkedlist
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){ // running the loop until
            slow = slow.next; // moving slow by 1
            fast = fast.next.next; // moving fast by 2
            if(slow == fast){ // if they meet
                slow = head; // reset slow to head
                while(slow != fast){ // run loop until again fast & slow don't collab
                    slow = slow.next; // moving slow by 1
                    fast = fast.next; // moving fast by 1 as well
                }
                return slow; // Or return fast same thing, they will return the tail where cycle starts
            }
        }
        return null; // if there is no cycle, it will return null
    }

    public static ListNode tail(ListNode head) {
        while (head.next != null) {head = head.next;}
        return head;
    }
}
