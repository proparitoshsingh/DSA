//https://leetcode.com/problems/first-missing-positive/description/

//O(n) time and O(n) space solution

// class Solution {
//    public int firstMissingPositive(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//        }
//        for(int i=1;i<=nums.length+1;i++){
//            if(!set.contains(i)) return i;
//        }
//        return -1;
//    }
// }

//O(n) time and O(1) space solution

class Solution {
   public int firstMissingPositive(int[] nums) {
      int n = nums.length;
      int res = 1;
      for (int i = 0; i < n; i++) {
         while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
            int temp = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = temp;
         }
      }

      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
         if (nums[i] != i + 1)
            return i + 1;
      }
      return n + 1;
   }
}