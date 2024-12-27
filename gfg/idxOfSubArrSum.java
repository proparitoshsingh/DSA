//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Searching&sortBy=submissions

class Solution {
   static ArrayList<Integer> subarraySum(int[] arr, int target) {
      ArrayList<Integer> res = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
         int sum = 0;
         for (int j = i; j < arr.length; j++) {
            sum += arr[j];
            if (sum == target) {
               res.add(i + 1);
               res.add(j + 1);
               return res;
            }
         }
      }
      res.add(-1);
      return res;
   }
}