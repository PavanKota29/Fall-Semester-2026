//1. Maximum sum of hour glass in matrix (Hackerrank)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N = 5;
        int[][] mat = new int[N][N];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = 0;
        for(int i=0;i<N-2;i++){
            for(int j=0;j<N-2;j++){
                int currSum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]);
                currSum += (mat[i+1][j+1]);
                currSum += (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                maxSum = Math.max(maxSum,currSum);
            }
        }
        System.out.print(maxSum);
    }
}

//2. Maximum sum of hour glass in matrix (leetcode 2428)

class Solution {
    public int maxSum(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;

        int maxSum = 0;
        for(int i=0;i<N-2;i++){
            for(int j=0;j<M-2;j++){
                int currSum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]);
                currSum += (mat[i+1][j+1]);
                currSum += (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }
}
