package SDEsheet.tree1;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

class Solution {
   public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      Stack<TreeNode> st = new Stack<>();
      Stack<TreeNode> ot = new Stack<>();
      if (root == null) {
         return result;
      }
      st.push(root);

      while (!st.isEmpty()) {
         TreeNode node = st.pop();
         ot.push(node);

         if (node.left != null) {
            st.push(node.left);
         }
         if (node.right != null) {
            st.push(node.right);
         }
      }

      while (!ot.isEmpty()) {
         result.add(ot.pop().val);
      }
      return result;
   }
}