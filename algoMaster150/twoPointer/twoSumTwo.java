//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

// naive approach - O(n^2) time complexity and O(1) space complexity
// class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//       for (int i = 0; i < numbers.length; i++) {
//          for (int j = i + 1; j < numbers.length; j++) {
//             if (i != j) {
//                if ((numbers[i] + numbers[j]) == target)
//                   return new int[] { i + 1, j + 1 };
//             }
//          }
//       }
//       return new int[] {};
//    }
// }


// two pointer approach - O(n) time complexity and O(1) space complexity
class Solution {
   public int[] twoSum(int[] numbers, int target) {
      int left = 0;
      int right = numbers.length - 1;

      while (left < right) {
         int sum = numbers[left] + numbers[right];
         
         if (sum == target) {
            return new int[] { left + 1, right + 1 }; // Return 1-indexed positions
         } else if (sum < target) {
            left++;
         } else {
            right--;
         }
      }

      return new int[] {};
   }
}