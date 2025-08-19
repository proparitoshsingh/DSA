import java.util.*;

public class nearGoodNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            nearGoodNum(a, b);
        }
    }

    public static void nearGoodNum(long a, long b) {
        if (b == 1) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        long x = a;
        long y = a * b;
        long z = a * (b + 1);

        System.out.println(x + " " + y + " " + z);
    }
}