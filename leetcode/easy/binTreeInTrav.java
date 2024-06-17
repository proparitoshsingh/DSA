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
//    public List<Integer> inorderTraversal(TreeNode root) {
//       List<Integer> result = new ArrayList<>();
//       Stack<TreeNode> stack = new Stack<>();
//       TreeNode current = root;

//       while (current != null || !stack.isEmpty()) {
//          while (current != null) {
//             stack.push(current);
//             current = current.left;
//          }
//          current = stack.pop();
//          result.add(current.val);
//          current = current.right;
//       }

//       return result;
//    }
// }

// recursive solution
class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      inorder(root, result);
      return result;
   }

   private void inorder(TreeNode node, List<Integer> result) {
      if (node != null) {
         inorder(node.left, result);
         result.add(node.val);
         inorder(node.right, result);
      }
   }
}