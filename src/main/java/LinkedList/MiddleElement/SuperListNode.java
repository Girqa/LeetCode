package LinkedList.MiddleElement;

public class SuperListNode extends ListNode{
    SuperListNode(int val) {
        super(val);
    }
    @Override
    public void display() {
        System.out.println("SUPER NODE: " + val +"; " + next);
    }
}
