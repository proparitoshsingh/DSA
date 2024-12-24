package SDEsheet.tree2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
   public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result=new ArrayList<>();
      if(root==null){
         return result;
      }
      Queue<TreeNode> que=new ArrayDeque<>();
      que.add(root);
      while(que.size()>0){
         List<Integer> temp = new ArrayList<>();
         int len=que.size();
         for(int i=0;i<len;i++){
            TreeNode node=que.remove();
            temp.add(node.val);

            if(node.left!=null){
               que.add(node.left);
            }
            if(node.right!=null){
               que.add(node.right);
            }
         }result.add(temp);
      }return result;
   }
}