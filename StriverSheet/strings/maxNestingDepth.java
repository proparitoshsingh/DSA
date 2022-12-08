import java.io.*; 
import java.util.*; 
public class maxNestingDepth { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n=sc.next(); 
        System.out.println(depth(n));
        sc.close(); 
    } 
    public static int depth(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int maxd=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                maxd=st.peek()+1;
                res=Math.max(maxd, res);
                st.push(maxd);
            }if(ch==')'){
                st.pop();
            }
        }return res;
    }
}