import java.io.*; 
import java.util.*; 
public class ismorphicStrings { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n1=sc.next(); 
        String n2=sc.next(); 
        System.out.println(isIso(n1,n2));
        sc.close(); 
    } 
    public static Boolean isIso(String str1,String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character , Character> map1=new HashMap<>();
        HashMap<Character , Boolean> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }else{
                if(map2.containsKey(ch2)){
                    return false;
                }else{
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }return true;

    }
}