//Maneuvering a cave problem using recursion
import java.io.*;
import java.util.*;

public class Solution {
    public static int solve(int i,int j,int M,int N){
        //base case
        if(i == M-1 || j == N-1) return 1;
        
        return solve(i,j+1,M,N) + solve(i+1,j,M,N);    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        System.out.print(solve(0,0,M,N));
    }
}

//Maneuvering a cave problem using recursion + memorization
import java.io.*;
import java.util.*;

public class Solution {
    public static int solve(int i,int j,int M,int N,int[][] dp){
        //base case
        if(i == M-1 || j == N-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        
        dp[i][j] = solve(i,j+1,M,N,dp) + solve(i+1,j,M,N,dp); 
        return dp[i][j];   
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] dp = new int[M][N];
        for(int[] row : dp) Arrays.fill(row,-1);
        
        System.out.print(solve(0,0,M,N,dp));
    }
}

//Maneuvering a cave problem using dp
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] dp = new int[M][N];
        
        //base case
        for(int i=0;i<M;i++) dp[i][0] = 1;
        for(int i=0;i<N;i++) dp[0][i] = 1;
        
        for(int i=1;i<M;i++){
            for(int j=1;j<N;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.print(dp[M-1][N-1]);
        
    }
}

