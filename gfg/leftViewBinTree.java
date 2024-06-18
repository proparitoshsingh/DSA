class Tree {
   // Function to return list containing elements of left view of binary tree.
   ArrayList<Integer> leftView(Node root) {
      // Your code here
      ArrayList<Integer> result = new ArrayList<>();
      if (root == null) {
         return result;
      }
      Queue<Node> que = new ArrayDeque<>();
      que.add(root);

      while (!que.isEmpty()) {
         int len = que.size();
         for (int i = 0; i < len; i++) {
            Node temp = que.remove();
            if (i == 0) {
               result.add(temp.data);
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