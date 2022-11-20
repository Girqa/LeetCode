package LinkedList.MiddleElement;


import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ListNode node = new SuperListNode(5);
        node.display();
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode list(int len){
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < len+1; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head;
    }
}