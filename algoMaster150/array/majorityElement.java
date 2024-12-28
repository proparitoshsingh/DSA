//https://leetcode.com/problems/majority-element/

class Solution {
   public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map= new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
           int freq=map.getOrDefault(nums[i],0)+1;
           if(freq>(n/2)) return nums[i];
           map.put(nums[i], freq);
       }
       return -1;
   }
}