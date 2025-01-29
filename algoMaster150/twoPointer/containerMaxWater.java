//https://leetcode.com/problems/container-with-most-water/description/

class Solution {
   public int maxArea(int[] height) {
       int res = 0;
       int left = 0, right = height.length - 1;
       while (left < right) {
           int area = Math.min(height[left], height[right]) * (right - left);
           res = Math.max(res, area);
           if (height[left] < height[right]) {
               left++;
           } else {
               right--;
           }
       }
       return res;
   }
}