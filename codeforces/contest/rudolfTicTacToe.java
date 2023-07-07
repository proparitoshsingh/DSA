import java.io.*; 
import java.util.*; 
public class rudolfTicTacToe { 
    public static void main(String args[]) { 
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char[][] grid = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String line = scanner.next();
                for (int j = 0; j < 3; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }boolean isDraw = true;
            char vijay = '.';
            for (int i = 0; i < 3; i++) {
                if (grid[i][0] != '.' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                    vijay = grid[i][0];
                    isDraw = false;
                    break;
                }
            }for (int j = 0; j < 3; j++) {
                if (grid[0][j] != '.' && grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j]) {
                    vijay = grid[0][j];
                    isDraw = false;
                    break;
                }
            }if (grid[0][0] != '.' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
                vijay = grid[0][0];
                isDraw = false;
            } else if (grid[0][2] != '.' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
                vijay = grid[0][2];
                isDraw = false;
            }if (vijay != '.') {
                System.out.println(vijay);
            }else if (isDraw) {
                System.out.println("DRAW");
            }else {
                System.out.println("+");
            }
        }
    } 
}