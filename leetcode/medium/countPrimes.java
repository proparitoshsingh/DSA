
class Solution {
   public int countPrimes(int n) {
      if(n<=2) return 0;
      boolean c[]=new boolean[n];
      int limit=(int)Math.sqrt(n);
      for(int i=2;i<=limit;i++){
         if(!c[i]){
            for(int j=i*i;j<n;j+=i){
               c[j]=true;
            }
         }
      }int count=0;
      for(int i=2;i<n;i++){
         if(!c[i]) count++;
      }
      return count;
   }
}




//most naive approach
//
// class Solution {
//    public int countPrimes(int n) {
//         if (n <= 1) {
//            return 0;
//        }
//        int count = 0;
//        for (int i = 2; i < n; i++) {
//            boolean isPrime = true;

//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }if (isPrime) {
//                count++;
//            }
//        }return count;
//    }
// }