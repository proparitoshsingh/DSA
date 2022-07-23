import java.util.Scanner; 
public class lastIndex { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int x=sc.nextInt();
        System.out.println(firstind(arr,x,0,-1));;
        sc.close(); 
    } 
    public static int firstind(int[] a ,int b,int c,int d) {
        if(c==a.length){
            if(d==-1){
                return -1;
            }return d;
        }int tres=a[c];
        if(tres==b){
            d=c;
        }
        int fres=firstind(a, b, c+1,d);
        return fres;
    } 
}