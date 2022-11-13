import java.io.*; 
import java.util.*; 
public class reverseWord { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n=sc.nextLine(); 
        System.out.println(reverseWords(n));
        sc.close(); 
    } 
    public static String reverseWords(String s) {
        s +=" ";
        StringBuilder str=new StringBuilder();
        int idx=0;
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                if(i==0 || s.charAt(i-1)== ' '){
                    continue;
                }
                a.add(str.toString());
                str=new StringBuilder();
            }else{
                str.append(s.charAt(i));
            }
        }String res=a.get(a.size()-1);
        for(int i=a.size()-2;i>-1;i--){
            res+=" "+a.get(i);
        }return res;

    }
}

/*optimized code
int n = s.length();
StringBuilder ans = new StringBuilder("");
StringBuilder temp = new StringBuilder("");

for(
int i = n - 1;i>=0;i--)
{
    char ch = s.charAt(i);

    if (ch != ' ')
        temp.append(ch);

    if ((ch == ' ' || i == 0) && temp.length() > 0) {
        if (ans.length() > 0)
            ans.append(" ");
        temp.reverse();
        ans.append(temp);
        temp.setLength(0);
    }
}

return ans.toString()
;*/ 