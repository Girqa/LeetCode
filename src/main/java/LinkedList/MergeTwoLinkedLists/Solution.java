package LinkedList.MergeTwoLinkedLists;


import LinkedList.MiddleElement.ListNode;


public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(
                s.mergeTwoLists(null, new ListNode(0))
        );
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
                cur = cur.next;
            } else {
                cur.next = new ListNode(list1.val);
                cur = cur.next;
                list1 = list1.next;
            }
        }
        if (list1 == null) {
            cur.next = list2;
        } else if (list2 == null) {
            cur.next = list1;
        }
        return dummy.next;
    }
}
