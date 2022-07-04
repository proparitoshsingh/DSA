import java.util.Scanner; 
public class matrixMultiplication { 

    public static void display(int[][] b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }System.out.println();
        }
    }
    
    public static int[][] matmult(int[][] b1,int[][] b2){
        int fr=b1.length;
        int fc=b1[0].length;
        int sc=b2[0].length;
        int[][] b=new int[fr][sc];
        for(int i=0;i<fr;i++){
            for(int j=0;j<sc;j++){
                for(int z=0;z<fc;z++){
                    b[i][j]=b[i][j]+(b1[i][z]*b2[z][j]);
                }
            }
        }return b;
    }
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] a1=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[][] a2=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                a2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        if(m1!=n2){
            System.out.println("Invalid input");
        }else{
            int[][] b=matmult(a1,a2);
            display(b);
        }
    } 
}