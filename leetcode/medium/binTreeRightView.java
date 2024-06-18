import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
   public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      if (root == null) {
         return result;
      }
      Queue<TreeNode> que = new ArrayDeque<>();
      que.add(root);

      while (!que.isEmpty()) {
         int len = que.size();
         for (int i = 0; i < len; i++) {
            TreeNode temp = que.remove();
            if (i == len - 1) {
               result.add(temp.val);
            }
            if (temp.left != null) {
               que.add(temp.left);
            }
            if (temp.right != null) {
               que.add(temp.right);
            }
         }
      }
      return result;
   }
}