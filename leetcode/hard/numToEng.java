//https://leetcode.com/problems/integer-to-english-words/description/

class Solution {
   private final String[] upto20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
         "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
   private final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
         "Ninety" };
   private final String[] thousands = { "", "Thousand", "Million", "Billion" };

   public String numberToWords(int num) {
      if (num == 0)
         return "Zero";
      int i = 0;
      String res = "";

      while (num > 0) {
         if (num % 1000 != 0) {
            res = helper(num % 1000) + thousands[i] + " " + res;
         }
         num /= 1000;
         i++;
      }
      return res.trim();
   }

   public String helper(int num) {
      if (num == 0)
         return "";
      else if (num < 20)
         return upto20[num] + " ";
      else if (num < 100)
         return tens[num / 10] + " " + helper(num % 10);
      else
         return upto20[num / 100] + " Hundred " + helper(num % 100);
   }
}