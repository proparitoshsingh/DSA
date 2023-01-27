import java.io.*; 
import java.util.*; 
public class aplusb { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            String str=sc.next();
            System.out.println(somesum(str));
        }
        sc.close(); 
    } 
    public static int somesum(String s) {
        int a=s.charAt(0)-'0';
        int b=s.charAt(2)-'0';
        return a+b;
    }
}