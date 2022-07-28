import java.util.Scanner; 
public class printSubSequence { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String st=sc.next(); 
        printss(st,"");
        sc.close(); 
    } 
    public static void printss(String str,String ans){  
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char a=str.charAt(0);
        String res=str.substring(1);
        printss(res, ans+a);
        printss(res, ans+"");
    }
}