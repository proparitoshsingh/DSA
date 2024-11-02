import java.util.Scanner;

public class quintomania {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();

      for (int i = 0; i < t; i++) {
         int n = scanner.nextInt();
         int[] notes = new int[n];

         for (int j = 0; j < n; j++) {
            notes[j] = scanner.nextInt();
         }

         boolean flag = true;
         for (int j = 1; j < n; j++) {
            int diff = Math.abs(notes[j] - notes[j - 1]);
            if (diff != 5 && diff != 7) {
               flag = false;
               break;
            }
         }

         System.out.println(flag ? "YES" : "NO");
      }
   }
}
