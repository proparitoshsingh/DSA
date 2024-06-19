class Solution {
   // Function to return a list of nodes visible from the top view
   // from left to right in Binary Tree.
   static ArrayList<Integer> topView(Node root) {
      // add your code
      ArrayList<Integer> result = new ArrayList<>();
      if (root == null) {
         return result;
      }

      Map<Integer, Integer> map = new TreeMap<>();
      Queue<Node> que = new LinkedList<>();
      Map<Node, Integer> hdMap = new HashMap<>();
      que.add(root);
      hdMap.put(root, 0);

      while (!que.isEmpty()) {
         Node temp = que.poll();
         int hd = hdMap.get(temp);
         if (!map.containsKey(hd)) {
            map.put(hd, temp.data);
         }
         if (temp.left != null) {
            que.add(temp.left);
            hdMap.put(temp.left, hd - 1);
         }
         if (temp.right != null) {
            que.add(temp.right);
            hdMap.put(temp.right, hd + 1);
         }
      }
      for (Integer value : map.values()) {
         result.add(value);
      }

      return result;
   }
}