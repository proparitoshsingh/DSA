//https://leetcode.com/problems/is-subsequence/description/

//two pointer 

class Solution {
   public boolean isSubsequence(String s, String t) {
      int i = 0, j = 0;
      while (i < s.length() && j < t.length()) {
         j++;
         if (s.charAt(i) == t.charAt(j - 1)) {
            i++;
         }
      }
      if (i == s.length())
         return true;
      return false;
   }
}