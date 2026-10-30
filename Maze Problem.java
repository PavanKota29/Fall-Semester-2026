//Maze solving (Hackerrank)
import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean solve(int[][] mat,int N,int M,
    int i,int j,int[][] res){
        //base case
        if(i < 0 || i >= N || j < 0 || j >= M || 
        mat[i][j] == 0) return false;
        
        if(i == N-1 && j == M-1){
            res[i][j] = 1;
            return true;
        }
        
        res[i][j] = 1;
        
        //down
        if(solve(mat, N, M, i+1, j, res)){
            return true;
        }
        
        //right
        if(solve(mat, N, M, i, j+1, res)){
            return true;
        }
        res[i][j] = 0;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                mat[i][j] = sc.nextInt(); 
            }
        }
        
        int[][] res = new int[N][M];
        
        if(solve(mat,N,M,0,0,res)){
            for(int[] row : res){
                for(int val : row){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }else{
            System.out.print("No Solution");
        }
    }
}
