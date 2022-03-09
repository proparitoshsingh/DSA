import java.util.Scanner; 
public class searchInArray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }int b=sc.nextInt();
        boolean check=false;
        for(int i=0;i<n;i++){
            if(b==arr[i]){
                check=true;
                System.out.println(i);
                break;
            }
        }if(!check){
            System.out.println(-1);
        }
        sc.close(); 
    } 
}