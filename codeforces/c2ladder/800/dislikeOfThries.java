import java.io.*; 
import java.util.*; 
public class dislikeOfThries { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            term(n);
        }
    }
    public static void term(int n) {
        int ans=0;
        for(int i=0;i<n;i++){
            ans++;
            if(ans%3==0 || ans%10==3){
                ans++;
                if(ans%3==0 || ans%10==3){
                    ans++;
                }
            }
        }System.out.println(ans);
    }
}