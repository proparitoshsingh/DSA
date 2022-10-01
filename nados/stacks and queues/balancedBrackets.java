

import java.io.*; 
import java.util.*; 
public class balancedBrackets { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine(); 
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')' || ch=='}' || ch==']'){
                if(st.empty()){
                    System.out.println(false);
                    return;
                }else{
                    if((st.peek()!='(' && ch==')') || (st.peek()!='{' && ch=='}') || (st.peek()!='[' && ch==']')){
                        System.out.println(false);
                        return;
                    }st.pop();
                }
            }
        }if(st.empty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close(); 
    } 
}