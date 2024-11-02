import java.util.Scanner;

public class xorificator {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();

      for (int z = 0; z < t; z++) {
         long l = scanner.nextLong();
         long r = scanner.nextLong();
         int i = scanner.nextInt();
         int k = scanner.nextInt();

         long mod = 1L << i;
         long res = 0;

         for (long x = l; x <= r; x++) {
            if ((x % mod) != k) {
               res ^= x;
            }
         }

         System.out.println(res);
      }
   }
}
//got tle
