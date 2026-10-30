//N Queen (printing all solution)
import java.util.*;
public class NQueen {
    public static boolean isSafe(char[][] board,int row,int col,int N){
        int i=0,j=0;
        //same col
        i = row - 1;
        while(i >= 0){
            if(board[i][col] == 'Q') return false;
            i--;
        }
        //left
        i = row-1;j=col-1;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;j--;
        }
        //right
        i = row -1;j=col+1;
        while(i >= 0 && j < N){
            if(board[i][j] == 'Q') return false;
            i--;j++;
        }
        return true;
    }
    public static void solve(char[][] board,int row,int N){
        //base case
        if(row == N){
            for(char[] ch : board){
                System.out.println(new String(ch));
            }
            System.out.println();
            return;
        }

        for(int col = 0;col < N;col++){
            if(isSafe(board,row,col,N)){
                board[row][col] = 'Q';
                solve(board, row + 1, N);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] board = new char[N][N];
        for(char[] row : board)Arrays.fill(row,'.');
        solve(board, 0, N);
        
    }
}

//N Queen (printing Queen's position)
import java.util.*;
public class NQueen {
    public static boolean isSafe(char[][] board,int row,int col,int N){
        int i=0,j=0;
        //same col
        i = row - 1;
        while(i >= 0){
            if(board[i][col] == 'Q') return false;
            i--;
        }
        //left
        i = row-1;j=col-1;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;j--;
        }
        //right
        i = row -1;j=col+1;
        while(i >= 0 && j < N){
            if(board[i][j] == 'Q') return false;
            i--;j++;
        }
        return true;
    }
    public static void solve(char[][] board,int row,int N){
        //base case
        if(row == N){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(board[i][j]=='Q')
                    System.out.print("("+i+","+j+") ");
                }
            }
            System.out.println();
            return;
        }

        for(int col = 0;col < N;col++){
            if(isSafe(board,row,col,N)){
                board[row][col] = 'Q';
                solve(board, row + 1, N);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] board = new char[N][N];
        for(char[] row : board)Arrays.fill(row,'.');
        solve(board, 0, N);
        
    }
}


