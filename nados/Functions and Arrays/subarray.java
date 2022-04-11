import java.util.Scanner; 
public class subarray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }sub_arr(arr);
        sc.close(); 
    }public static void sub_arr(int arr[]){
        int a=arr.length;
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                for(int z=i;z<=j;z++){
                    System.out.print(arr[z]);
                    System.out.print("\t");
                }System.out.println();
            }
        }
    }
}