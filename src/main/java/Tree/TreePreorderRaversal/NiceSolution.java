package Tree.TreePreorderRaversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NiceSolution {
    public List<Integer> preorderStack(Node root) {
        List<Integer> result = new LinkedList<>();

        if (root == null) return result;

        Stack<Node> toVisit = new Stack<>();
        toVisit.push(root);

        while (!toVisit.isEmpty()) {
            Node visited = toVisit.pop();
            result.add(visited.val);

            for (int i = visited.children.size() - 1; i >= 0; i--) {
                toVisit.push(visited.children.get(i));
            }
        }
        return result;
    }
}
