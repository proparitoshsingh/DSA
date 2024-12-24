package SDEsheet.tree1;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


//iterative approach

//  class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//       List<Integer> res=new ArrayList<>();
//       if(root==null) return res;

//       Stack<TreeNode> st=new Stack<>();
//       st.push(root);

//       while(!st.isEmpty()){
//          TreeNode node=st.pop();
//          res.add(node.val);
//          if(node.right!=null) st.push(node.right);
//          if(node.left!=null) st.push(node.left);
//       }
//       return res;
//    }
// }


//recursive appproach

class Solution {
   public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> res=new ArrayList<>();
      preorder(root,res);
      return res;
   }
   public void preorder(TreeNode node, List<Integer> result){
      if(node==null) return;
      result.add(node.val);
      preorder(node.left, result);
      preorder(node.right, result);
   }
}