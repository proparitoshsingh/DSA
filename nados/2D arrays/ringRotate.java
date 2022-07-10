import java.util.Scanner; 
public class ringRotate { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }int s=sc.nextInt();
        int ro=sc.nextInt();
        int rmin=0+(s-1),rmax=r-1-(s-1),cmin=0+(s-1),cmax=c-1-(s-1),count=0,j=0;
        int n=(rmax-rmin)*2+(cmax-cmin)*2;
        int[] b=new int[n];
        while(count<n){
            for(int i=rmin;i<=rmax;i++){
                b[j]=a[i][cmin];
                j++;
                count++;
            }for(int i=cmin+1;i<=cmax;i++){
                b[j]=a[rmax][i];
                j++;
                count++;
            }for(int i=rmax-1;i>=rmin && count<n;i--){
                b[j]=a[i][cmax];
                j++;
                count++;
            }for(int i=cmax-1;i>=cmin+1 && count<n;i--){
                b[j]=a[rmin][i];
                j++;
                count++;
            }
        }int[] cn=b.clone();
        rotate(cn, ro);
        j=0;
        count=0;
        while(count<n){
            for(int i=rmin;i<=rmax;i++){
                a[i][cmin]=cn[j];
                j++;
                count++;
            }for(int i=cmin+1;i<=cmax;i++){
                a[rmax][i]=cn[j];
                j++;
                count++;
            }for(int i=rmax-1;i>=rmin && count<n;i--){
                a[i][cmax]=cn[j];
                j++;
                count++;
            }for(int i=cmax-1;i>=cmin+1 && count<n;i--){
                a[rmin][i]=cn[j];
                j++;
                count++;
            }
        }
        display(a);
        sc.close(); 
    }
    public static int[] rotate(int[] a,int k){
        while(k>a.length){
            k=k%a.length;
        }if(k==a.length || k==0){
            return a;
        }else{
            int last=a.length-1;
            for(int i=0;i<a.length/2;i++){
                int temp=a[i];
                a[i]=a[last];
                a[last]=temp;
                last--;
            }last=k;
            for(int i=0;i<k/2;i++){
                int temp=a[i];
                a[i]=a[last];
                a[last]=temp;
                last--;
            }last=a.length-1;
            for(int i=k;i<=a.length/2;i++){
                int temp=a[i];
                a[i]=a[last];
                a[last]=temp;
                last--;
            }return a;
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } 
}