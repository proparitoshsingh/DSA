//my approach

// class Solution {
//    public int repeatedStringMatch(String a, String b) {
//       StringBuilder temp=new StringBuilder(a);
//       int count=1;
//       while(temp.length()<b.length()){
//          temp.append(a);
//          count++;
//       }

//       if(temp.indexOf(b)!=-1){
//          return count;
//       }
//       temp.append(a);
//       count++;
//       if(temp.indexOf(b)!=-1){
//          return count;
//       }
//       return -1;
//    }
// }

//best approach

class Solution {

   public int repeatedStringMatch(String a, String b) {
      int ans = 1;
      boolean[] buc = new boolean[26];
      for (char c : a.toCharArray()) {
         buc[c - 'a'] = true;
      }
      for (char c : b.toCharArray()) {
         if (buc[c - 'a'] == false)
            return -1;
      }
      int c = (b.length() / a.length());

      StringBuilder sb = new StringBuilder(a.repeat(c));
      for (int i = 0; i < 3; i++) {
         if (sb.indexOf(b)!=-1)
            return c + i;
         sb.append(a);
      }
      return -1;
   }
}