import java.io.*; 
import java.util.*; 
public class polycarpAndPi { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            String n=sc.next();
            System.out.println(precise(n));
        }
    }
    public static int precise(String polyp){
        String pi="314159265358979323846264338327";
        int flag=0;
        for(int i=0;i<polyp.length();i++){
            if(pi.charAt(i)!=polyp.charAt(i)){
                return i;
            }if(i==polyp.length()-1)
            flag=1;
        }if(flag==1)
        return polyp.length();
        else
        return 30;
        
    }
}