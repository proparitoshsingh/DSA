import java.io.*; 
import java.util.*; 
public class mediumNumber { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(median(a, b, c));
        }
        sc.close(); 
    }
    public static int median(int a , int b ,int c) {
        if((a>b && b>c)|| (a<b && b<c)){
            return b;
        }else if((b>a && a>c)||(b<a && a<c)){
            return a;
        }else if((b>c && c>a)||(b<c && c<a)){
            return c;
        }return 0;
    }

}