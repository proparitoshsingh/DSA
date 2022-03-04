import java.util.Scanner;

public class primeFactors {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=2;
        while(i<=n){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }i++;
        }
    }
}
