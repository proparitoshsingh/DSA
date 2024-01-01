import java.io.*; 
import java.util.*; 
public class assignCookies { 
    public static void main(String args[]) { 
        System.out.println(assignCookies(n));
    } 
    public static int assignCookies(int n){
        int[] g={1,2,3};
        int[] s={1,1};
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}