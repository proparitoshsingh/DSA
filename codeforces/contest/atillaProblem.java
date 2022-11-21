import java.io.*; 
import java.util.*; 
public class atillaProblem { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            int size=sc.nextInt();
            String s=sc.next();
            System.out.println(atilla(s));
        }
        sc.close(); 
    }
    public static int atilla(String s) {
        int high=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int temp=ch-'a'+1;
            if(temp>high){
                high=temp;
            }
        }return high;

    } 
}