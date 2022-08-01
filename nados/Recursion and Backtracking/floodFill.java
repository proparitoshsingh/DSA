import java.util.Scanner; 
public class floodFill { 
    public static void main(String args[]) { 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();                                                                                                                                                                                                                                                                                                  
            }
        }
        boolean[][] visited=new boolean[n][m];                                                                                                                                                                                                                                                                                                                   
        floodf(arr, 0, 0, "",visited);
        scn.close(); 
    } 
    public static void floodf(int[][] arr,int sr,int sc,String ans,boolean[][] visit) {
        
        if(sr<0 || sc<0 || sr==arr.length || sc==arr[0].length || arr[sr][sc]==1 || visit[sr][sc]==true){
            return;
        }
        if(sr==arr.length-1 && sc==arr[0].length-1){
            System.out.println(ans);
            return;
        }visit[sr][sc]=true;
        floodf(arr, sr-1, sc, ans+"t",visit);
        floodf(arr, sr, sc-1, ans+"l",visit);
        floodf(arr, sr+1, sc, ans+"d",visit);
        floodf(arr, sr, sc+1, ans+"r",visit);
        visit[sr][sc]=false;
    }
}