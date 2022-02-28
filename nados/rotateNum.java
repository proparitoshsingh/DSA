import java.util.Scanner;

public class rotateNum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=n;
        int c,b,count=0;
        while(a!=0){
            a=a/10;
            count++;
        }if(k<0){
            while(k<-count){
                k=k+count;
            }if(k==-count){
                System.out.println(n);
            }else{
                k=k/-1;
                c=(n/((int)Math.pow(10, count-k)));
                b=(n%((int)Math.pow(10, count-k)))*((int)Math.pow(10, k));
                System.out.println(b+c);
            }
        }else{
            while(k>count){
                k=k-count;
            }if(k==count){
                System.out.println(n);
            }else{
                c=(n%((int)Math.pow(10, k)))*((int)Math.pow(10, (count-k)));
                b=n/((int)Math.pow(10, k));
                System.out.println(c+b);
            }
        }
        
        sc.close();
    }
}
