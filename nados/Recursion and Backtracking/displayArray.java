import java.util.Scanner; 
public class displayArray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        display(arr,0);
        sc.close(); 
    } 
    public static void display(int[] a,int b) {
        if(b==a.length){
            return;
        }
        System.out.println(a[b]);
        display(a, b+1);
    }
}