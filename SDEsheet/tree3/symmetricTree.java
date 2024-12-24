package SDEsheet.tree3;
class Solution {
   public boolean isSymmetric(TreeNode root) {
      if (root == null)
         return true;
      return checkSymmetric(root.left, root.right);
   }

   private boolean checkSymmetric(TreeNode ln,TreeNode rn){
      if(ln==null && rn==null) return true;
      if(ln==null || rn==null) return false;
      if(ln.val != rn.val) return false;
      return checkSymmetric(ln.left, rn.right) && checkSymmetric(ln.right, rn.left);
   }
}