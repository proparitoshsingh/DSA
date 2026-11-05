
import java.util.*;

public class ezzatNTwoSubseq {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(ezzatNTwoSubseq(n, arr));
        }
        sc.close();
    }

    public static double ezzatNTwoSubseq(int n, int[] arr) {
        int maxIdx = 0;
        for (int z = 0; z < n; z++) {
            if (arr[maxIdx] <= arr[z]) {
                maxIdx = z;
            }
        }

        double a = arr[maxIdx];
        double b = 0;
        for (int q = 0; q < n; q++) {
            if (q != maxIdx) {
                b += arr[q];
            }
        }
        
        return (double) (a + (double)(b/(n-1)));

    }
}
