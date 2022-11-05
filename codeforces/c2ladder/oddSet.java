import java.io.*; 
import java.util.*; 
public class oddSet { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            countkepper(n);
        }
    } 
    public static void countkepper(int n) {
        int ecount=0;
        int ocount=0;
        Scanner sc=new  Scanner(System.in);
        for(int j=0;j<n;j++){
            int temp=sc.nextInt();
            if(temp%2==0){
                ecount++;
            }else{
                ocount++;
            }
        }if(ecount==ocount){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}