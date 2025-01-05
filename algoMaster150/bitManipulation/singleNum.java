//https://leetcode.com/problems/single-number/description/

// hasmap approach

// class Solution {
//    public int singleNumber(int[] nums) {
//       Map<Integer, Integer> map = new HashMap<>();

//       for (int num : nums) {
//          map.put(num, map.getOrDefault(num, 0) + 1);
//       }

//       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//          if (entry.getValue() == 1) {
//             return entry.getKey();
//          }
//       }

//       return -1;
//    }
// }

//bitwise manipulation (using xor) approach 

class Solution {
   public int singleNumber(int[] nums) {
      int res = 0;
      for (int i = 0; i < nums.length; i++) {
         res ^= nums[i];
      }

      return res;
   }
}