import java.util.Scanner; 
public class spiralDisplay { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }int rmin=0, rmax=r-1,cmin=0,cmax=c-1,count=0;
        while(count<c*r){
            for(int j=rmin;j<=rmax;j++){
                System.out.println(a[j][cmin]);
                count++;
            }for(int j=cmin+1;j<=cmax;j++){
                System.out.println(a[rmax][j]);
                count++;
            }for(int j=rmax-1;j>=rmin && count<c*r;j--){
                System.out.println(a[j][cmax]);
                count++;
            }for(int j=cmax-1;j>=cmin+1 && count<c*r;j--){
                System.out.println(a[rmin][j]);
                count++;
            }
            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }sc.close(); 
    } 
}