import java.util.Scanner; 
public class palindromesInSubstring { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String st=sc.next();
        int n=st.length(); 
        for(int i =0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String pal=st.substring(i,j);
                if(palindrome(pal)){
                    System.out.println(pal);
                }
            }
        }


        sc.close(); 
    } 
    public static boolean palindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}