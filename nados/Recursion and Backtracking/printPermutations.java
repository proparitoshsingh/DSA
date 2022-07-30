import java.util.Scanner; 
public class printPermutations { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String st=sc.next(); 
        printp(st,"");
        sc.close(); 
    } 
    public static void printp(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        } 
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);   
            printp(res,ans+ch);
        }
    }
}