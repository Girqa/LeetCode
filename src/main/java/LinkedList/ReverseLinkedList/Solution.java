package LinkedList.ReverseLinkedList;

import LinkedList.MiddleElement.ListNode;

public class Solution {
    public ListNode reverseList(ListNode list) {
        if (list == null) return null;
        ListNode cur = new ListNode(list.val);
        list = list.next;
        while(list != null) {
            ListNode next = list.next;
            list.next = cur;
            cur = list;
            list = next;
        }
        return cur;
    }
}
