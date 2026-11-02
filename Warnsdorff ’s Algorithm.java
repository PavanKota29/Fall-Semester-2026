//Warnsdorff ’s Algorithm
import java.util.*;

public class Main {
    static int[] dx = {-2,-2,-1,+1,+2,+2,+1,-1};
    static int[] dy = {-1,+1,+2,+2,+1,-1,-2,-2};
    public static boolean isSafe(int[][] board,int i,int j,int N){
        return (i >=0 && i < N && j >=0 && j < N && board[i][j] == -1);
    }

    public static int findMove(int[][] board,int i,int j,int N){
        int count = 0;
        for(int k=0;k<8;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(isSafe(board, x, y, N)) count++;
        }
        return count;
    }
    
    public static boolean solve(int[][] board,int i,int j,int N,int val){
        //base case

        if(val == N * N) return true;

        int minCount = 99999;
        int nextX = -1;
        int nextY = -1;
        for(int k=0;k<8;k++){
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(isSafe(board,nx,ny,N)){
                int count = findMove(board,nx,ny,N);
                if(count < minCount){
                    minCount = count;
                    nextX = nx;
                    nextY = ny;
                }
            }
        }
        if(nextX == -1) return false;
        board[nextX][nextY] = val;
        if(solve(board, nextX, nextY, N, val+1)) return true;
        board[nextX][nextY] = -1;
        return false;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[][] board = new int[N][N];
       for(int[] row : board) Arrays.fill(row,-1);

       board[0][0] = 0;

       if(solve(board, 0, 0, N,1)){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.printf("%2d ",board[i][j]);
            }
            System.out.println();
        }
       }else{
        System.out.println("No Solution");
       }

    }
}
