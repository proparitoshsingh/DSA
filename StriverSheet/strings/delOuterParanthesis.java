import java.io.*; 
import java.util.*; 
public class delOuterParanthesis { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n=sc.next(); 
        System.out.println(removeOuterParentheses(n));
         
    } 
    public static String removeOuterParentheses(String n) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='('){
                if(st.size()>0){
                    str.append(ch);
                }st.push(ch);
            }else{
                st.pop();
                if(st.size()>0){
                    str.append(")");
                }
            }
        }return str.toString();
    }
}