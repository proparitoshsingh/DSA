// naive appraoch
// public class Solution {
//    public int maxSubArray(int[] nums) {
//       int sum=Integer.MIN_VALUE;
//       for(int i=0;i<nums.length;i++){
//          int curr=0;
//          for(int j=i;j<nums.length;j++){
//             curr+=nums[j];
//             sum=Math.max(sum, curr);
//          }
//       }return sum;
//    }
// }



//kadane s algo

public class Solution {
   public int maxSubArray(int[] nums) {
      int max = nums[0];
      int curr = nums[0];
      for (int i = 1; i < nums.length; i++) {
         curr = Math.max(nums[i], curr + nums[i]);
         max = Math.max(curr, max);
      }
      return max;
   }
}
