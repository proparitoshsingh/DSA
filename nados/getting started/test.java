import java.util.Scanner; 
public class test { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int mid=(n+1)/2;
        for(int i=1;i<=mid;i++){
            if(i==mid){
                for(int j=1;j<mid;j++){
                    System.out.print("*\t");
                }
            }else{
                for(int j=0;j<mid-1;j++){
                    System.out.print("\t");
                }
            }for(int j=0;j<i;j++){
                System.out.print("*\t");
            }System.out.println();
        }for(int i=1;i<mid;i++){
            for(int j=0;j<mid-1;j++){
                System.out.print("\t");
            }for(int j=mid;j>i;j--){
                System.out.print("*\t");
            }System.out.println();
        }
        sc.close(); 
    } 
}