import java.util.Scanner; 
public class anyBaseToDecimal { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
     }
    
     public static int getValueIndecimal(int n, int b){
        // write your code here
        int a,num=0;
        int c=0;
        while(n>=1){
            a=(int)((n%10)*Math.pow(b, c));
            num=num+a;
            c++;
            n=n/10;
        }
        return num;
     } 
}