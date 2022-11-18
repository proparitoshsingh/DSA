import java.io.*; 
import java.util.*; 
public class yesYes { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            String s=sc.next();
            System.out.println(yesorno(s));
        }
        sc.close(); 
    }public static String yesorno(String str) {
        if(str.length()==1){
            if(str.charAt(0)=='Y' || str.charAt(0)=='e' || str.charAt(0)=='s'){
                return "YES";
            }return "NO";
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='Y'){
                if(str.charAt(i+1)!='e'){
                    return "NO";
                }
            }else if(str.charAt(i)=='e'){
                if(str.charAt(i+1)!='s'){
                    return "NO";
                }
            }else if(str.charAt(i)=='s'){
                if(str.charAt(i+1)!='Y'){
                    return "NO";
                }
            }
            else{
                return "NO";
            }
        }return "YES";
    }
}