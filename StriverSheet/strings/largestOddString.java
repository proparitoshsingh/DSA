import java.io.*; 
import java.util.*; 
public class largestOddString { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n=sc.next(); 
        System.out.println(largeString(n));
        sc.close(); 
    }public static String largeString(String num) {
        String res="";
        for(int i=num.length()-1;i>-1;i--){
            int temp=num.charAt(i)-'0';
            if(temp%2!=0){
                res=num.substring(0, i+1);
                return res;
            }
        }return res;
    }
}

/* */