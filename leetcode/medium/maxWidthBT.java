import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Pair{
   TreeNode node;
   int num;
   Pair(TreeNode node,int num){
      this.num=num;
      this.node=node;
   }
}
class Solution {
   public int widthOfBinaryTree(TreeNode root) {
      if(root==null) return 0;
      int res=0;
      Queue<Pair> q=new LinkedList<>();
      q.offer(new Pair(root,0));
      while (!q.isEmpty()) {
         int size=q.size();
         int mmin=q.peek().num;
         int first=0,last=0;
         for(int i=0;i<size;i++){
            int curr=q.peek().num-mmin;
            TreeNode node=q.peek().node;
            q.poll();
            if(i==0) first=curr;
            if(i==size-1) last=curr;
            if(node.left!=null){
               q.offer(new Pair(node.left, curr*2+1));
            }
            if(node.right!=null){
               q.offer(new Pair(node.right,curr*2+2));
            }
         }
         res=Math.max(res, last-first+1);
      }
      return res;
   }
}