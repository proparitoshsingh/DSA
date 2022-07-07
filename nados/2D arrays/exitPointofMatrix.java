/* 
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
*/

import java.util.Scanner; 
public class exitPointofMatrix { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int row=0;int column = 0;
        int dir=0; 
        while(true){
            dir=(dir+a[row][column])%4;
            if(dir==0){
                column=column+1;
            }else if(dir==1){
                row=row+1;
            }else if(dir==2){
                column=column-1;
            }else if(dir==3){
                row=row-1;
            }if(row==a.length){
                System.out.println(row-1);
                System.out.println(column);
                break;
            }else if(column==a[0].length){
                System.out.println(row);
                System.out.println(column-1);
                break;
            }

        }
        
        sc.close(); 
    } 
}