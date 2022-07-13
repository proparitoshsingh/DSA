import java.util.Scanner; 
public class togglingString { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            if(Character.isLowerCase(sb.charAt(i))){
                sb.replace(i, i+1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }else if(Character.isUpperCase(sb.charAt(i))){
                sb.replace(i, i+1, String.valueOf(Character.toLowerCase(sb.charAt(i))));
            }
        }
        System.out.println(sb);
        sc.close(); 
    } 
}