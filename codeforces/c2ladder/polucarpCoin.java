import java.io.*; 
import java.util.*; 
public class polucarpCoin { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            coin(n);
        }
    }
    public static void coin(int n) {
        int c1=n/3;
        int c2=(n-c1);
        if(c2%2!=0){
            c1++;
        }
        System.out.println(c1+" "+c2/2);
    } 
}