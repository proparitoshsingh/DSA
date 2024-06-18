//https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
   // Function to return a list containing the bottom view of the given tree.
   public ArrayList<Integer> bottomView(Node root) {
      // Code here
      ArrayList<Integer> result = new ArrayList<>();
      if (root == null) {
         return result;
      }
      Map<Integer, Integer> map = new TreeMap<>();
      Queue<Node> que = new ArrayDeque<>();
      root.hd = 0;
      que.add(root);

      while (!que.isEmpty()) {
         Node temp = que.remove();
         int hd=temp.hd;
         map.put(hd, temp.data);
         if (temp.left != null) {
            temp.left.hd=hd-1;
            que.add(temp.left);
         }
         if (temp.right != null) {
            temp.right.hd=hd+1;
            que.add(temp.right);
         }
      }
      for(Map.Entry<Integer,Integer> entry: map.entrySet()){
         result.add(entry.getValue());
      }
      return result;
   }
}