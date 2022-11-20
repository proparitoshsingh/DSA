import java.io.*; 
import java.util.*; 
public class validAnagram { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s=sc.next(); 
        String t=sc.next(); 
        System.out.println(isAna(s, t));
        sc.close(); 
    }
    public static boolean isAna(String s , String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ah=t.charAt(i);
            if(h1.containsKey(ch)){
                h1.put(ch, h1.get(ch)+1);
            }else{
                h1.put(ch, 1);
            }if(h2.containsKey(ah)){
                h2.put(ah, h2.get(ah)+1);
            }else{
                h2.put(ah, 1);
            }
        }for(Map.Entry<Character,Integer> mapelement : h1.entrySet()){
            char ch=mapelement.getKey();
            int val=mapelement.getValue();
            if(h2.containsKey(ch)){
                if(h2.get(ch)!=val){
                    return false;
                }
            }else{
                return false;
            }
        }return true;
    }
}