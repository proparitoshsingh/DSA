import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

// iterative approach

// class Solution {
// public List<Integer> inorderTraversal(TreeNode root) {
// List<Integer> result = new ArrayList<>();
// Stack<TreeNode> stack = new Stack<>();
// TreeNode curr = root;

// while (curr != null || !stack.isEmpty()) {
// while (curr != null) {
// stack.push(curr);
// curr = curr.left;
// }
// curr = stack.pop();
// result.add(curr.val);
// curr = curr.right;
// }

// return result;
// }
// }

// recursive solution
// class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//       List<Integer> result = new ArrayList<>();
//       inorder(root, result);
//       return result;
//    }

//    private void inorder(TreeNode node, List<Integer> result) {
//       if (node != null) {
//          inorder(node.left, result);
//          result.add(node.val);
//          inorder(node.right, result);
//       }
//    }
// }


// morris inorder traversal (best approach)
class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      TreeNode curr = root;

      while (curr != null) {
         if (curr.left == null) {
            result.add(curr.val);
            curr = curr.right;
         } else {
            TreeNode pred = curr.left;
            while (pred.right != null && pred.right != curr) {
               pred = pred.right;
            }
            if (pred.right == null) {
               pred.right = curr;
               curr = curr.left;
            } else {
               pred.right = null;
               result.add(curr.val);
               curr = curr.right;
            }
         }
      }

      return result;
   }
}