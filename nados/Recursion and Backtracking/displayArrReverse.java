import java.util.Scanner; 
public class displayArrReverse { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rdisplay(arr,0);
        sc.close(); 
    } 
    public static void rdisplay(int[] a,int b) {
        if(b==a.length){
            return;
        }
        rdisplay(a, b+1);
        System.out.println(a[b]);
    }
}