//naive approach

// class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//       Stack<TreeNode> st = new Stack<>();
//       List<TreeNode> pathP = new ArrayList<>();
//       List<TreeNode> pathQ = new ArrayList<>();

//       findPath(root, p, pathP);
//       findPath(root, q, pathQ);

//       int i = 0;
//       while (i < pathP.size() && i < pathQ.size() && pathP.get(i) == pathQ.get(i)) {
//          i++;
//       }
//       return pathP.get(i - 1);
//    }

//    private boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {
//       if (root == null) {
//          return false;
//       }
//       path.add(root);
//       if (root == target) {
//          return true;
//       }
//       if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
//          return true;
//       }
//       path.remove(path.size() - 1);
//       return false;
//    }
// }

//best approach 

class Solution {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null || root == p || root == q)
         return root;
      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);
      if (left == null && right == null)
         return null;
      if (left != null && right != null)
         return root;
      return left == null ? right : left;
   }
}