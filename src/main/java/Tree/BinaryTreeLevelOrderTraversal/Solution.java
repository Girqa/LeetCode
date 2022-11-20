package Tree.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Recursion algorithm
class Solution {
    private List<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        levels.add(new ArrayList<>(List.of(root.val)));
        if (root.left != null) levelVals(root.left, 1);
        if (root.right != null) levelVals(root.right, 1);
        return levels;
    }

    public void levelVals(TreeNode node, int level){
        if (levels.size() < level+1) {
            levels.add(new LinkedList<Integer>());
        }
        levels.get(level).add(node.val);
        level++;
        if (node.left != null) levelVals(node.left, level);
        if (node.right != null) levelVals(node.right, level);
    }
}

class QueueSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int curLevelElementsCount = queue.size();
            List<Integer> levelVals = new ArrayList<>();

            for(int i = curLevelElementsCount; i > 0; i--) {
                TreeNode head = queue.poll();
                if (head.left != null) queue.offer(head.left);
                if (head.right != null) queue.offer(head.right);
                levelVals.add(head.val);
            }
            result.add(levelVals);
        }
        return result;
    }
}

 // Definition for a binary tree node.
class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode() {}
   TreeNode(int val) { this.val = val; }
   TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
   }
}