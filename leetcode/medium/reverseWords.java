class Solution {
   public String reverseWords(String s) {
      boolean flag = false;
      String res = "";
      String temp = "";
      for (int i = s.length() - 1; i >= 0; i--) {
         if (s.charAt(i) == ' ' && flag) {
            temp = reverse(temp);
            res += temp + " ";
            temp = "";
            flag = false;
         } else if (s.charAt(i) != ' ') {
            temp += s.charAt(i);
            flag = true;
         }
      }
      if (flag) {
         temp = reverse(temp);
         res += temp;
      }
      return res.trim();
   }

   public String reverse(String s) {
      String res = "";
      for (int i = s.length() - 1; i >= 0; i--) {
         res += s.charAt(i);
      }
      return res;
   }
}