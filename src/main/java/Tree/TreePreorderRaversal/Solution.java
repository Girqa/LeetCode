package Tree.TreePreorderRaversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> result = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return result;
        result.add(root.val);
        while (root.children.size() != 0) {
            preorder(root.children.remove(0));
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
