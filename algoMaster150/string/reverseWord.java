//https://leetcode.com/problems/reverse-words-in-a-string/

//O(n) time and O(n) space approach

// class Solution {
//    public String reverseWords(String s) {
//       boolean flag = false;
//       String res = "";
//       String temp = "";
//       for (int i = s.length() - 1; i >= 0; i--) {
//          if (s.charAt(i) == ' ' && flag) {
//             temp = reverse(temp);
//             res += temp + " ";
//             temp = "";
//             flag = false;
//          } else if (s.charAt(i) != ' ') {
//             temp += s.charAt(i);
//             flag = true;
//          }
//       }
//       if (flag) {
//          temp = reverse(temp);
//          res += temp;
//       }
//       return res.trim();
//    }

//    public String reverse(String s) {
//       String res = "";
//       for (int i = s.length() - 1; i >= 0; i--) {
//          res += s.charAt(i);
//       }
//       return res;
//    }
// }

// O(n) time and O(1) space approach

class Solution {
   public String reverseWords(String s) {
      char[] str = s.toCharArray();
      reverse(str, 0, s.length() - 1);
      revWords(str);
      return cleanSpaces(str);
   }

   private void reverse(char[] str, int start, int end) {
      while (start < end) {
         char temp = str[start];
         str[start++] = str[end];
         str[end--] = temp;
      }
   }

   private void revWords(char[] str) {
      int n = str.length;
      int start = 0;
      for (int end = 0; end < n; end++) {
         if (str[end] == ' ') {
            reverse(str, start, end - 1);
            start = end + 1;
         }
      }
      reverse(str, start, n - 1);
   }

   private String cleanSpaces(char[] str) {
      int n = str.length;
      int i = 0, j = 0;

      while (j < n) {
         while (j < n && str[j] == ' ')
            j++;
         while (j < n && str[j] != ' ')
            str[i++] = str[j++];
         while (j < n && str[j] == ' ')
            j++;
         if (j < n)
            str[i++] = ' ';
      }

      return new String(str, 0, i);
   }
}