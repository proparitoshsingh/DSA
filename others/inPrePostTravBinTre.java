//https://www.naukri.com/code360/problems/981269?topList=striver-sde-sheet-problems

import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Solution {
   public static List<List<Integer>> getTreeTraversal(TreeNode root) {
      // Write your code here.
      List<List<Integer>> result = new ArrayList<>();
      List<Integer> in = new ArrayList<>();
      List<Integer> pre = new ArrayList<>();
      List<Integer> post = new ArrayList<>();

      if (root == null) {
         result.add(in);
         result.add(pre);
         result.add(post);
         return result;
      }
      
      Stack<TreeNode> st = new Stack<>();
      Stack<Integer> num = new Stack<>();
      st.add(root);
      num.add(1);
      while (!st.isEmpty()) {
         TreeNode node = st.peek();
         int n = num.peek();
         if(n == 1) {
            pre.add(node.data);
            num.pop();
            num.add(2);
            if (node.left != null) {
               st.add(node.left);
               num.add(1);
            }
         }else if(n == 2) {
            in.add(node.data);
            num.pop();
            num.add(3);
            if (node.right != null) {
               st.add(node.right);
               num.add(1);
            }
         }else if(n == 3) {
            post.add(node.data);
            num.pop();
            st.pop();
         }
      }
      result.add(in);
      result.add(pre);
      result.add(post);
      return result;
   }
}