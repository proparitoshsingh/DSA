import java.util.Scanner; 
public class anyBaseSubtraction { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getSum(int b, int n1, int n2){
        int a,num=0;
        int d,fnum=0;
        int c=0,sum=0;
        while(n1>=1){
            a=(int)((n1%10)*Math.pow(b, c));
            num=num+a;
            c++;
            n1=n1/10;
        }c=0;
        while(n2>=1){
            a=(int)((n2%10)*Math.pow(b, c));
            fnum=fnum+a;
            c++;
            n2=n2/10;
        }d=fnum-num;c=0;
        while(d>=1){
            a=(int)((d%b)*Math.pow(10, c));
            sum=sum+a;
            d=d/b;
            c++;
        }return sum;
    } 
}