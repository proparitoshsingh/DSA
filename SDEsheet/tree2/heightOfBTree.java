import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

//most naive approach

// class Solution {
//    public int maxDepth(TreeNode root) {
//       if(root==null) return 0;
//       int mh=1;
//       Stack<TreeNode> st=new Stack<>();
//       Stack<Integer> ht=new Stack<>();
//       st.push(root);
//       ht.push(1);
//       while(!st.isEmpty()){
//          TreeNode node=st.pop();
//          int ch=ht.pop();
//          mh=Math.max(mh, ch);
//          if(node.left!=null){
//             ht.push(ch+1);
//             st.push(node.left);
//          }if(node.right!=null){
//             ht.push(ch+1);
//             st.push(node.right);
//          }
//       }return mh;
//    }
// }

///best approach iteratively

// class Solution {
//    public int maxDepth(TreeNode root) {
//       if (root == null)
//          return 0;
//       Queue<TreeNode> q = new LinkedList<>();
//       int dp = 0;
//       q.add(root);
//       while (!q.isEmpty()) {
//          dp++;
//          int size = q.size();
//          for (int i = 0; i < size; i++) {
//             TreeNode node = q.poll();
//             if (node.left != null) {
//                q.add(node.left);
//             }
//             if (node.right != null) {
//                q.add(node.right);
//             }
//          }
//       }
//       return dp;
//    }
// }

// best recursive solution

class Solution {

   public int getDepth(TreeNode root) {
      if (root == null) return 0;
      int leftH = getDepth(root.left);
      int rightH = getDepth(root.right);
      return Math.max(leftH, rightH) + 1;
   }

   public int maxDepth(TreeNode root) {
      return getDepth(root);
   }
}