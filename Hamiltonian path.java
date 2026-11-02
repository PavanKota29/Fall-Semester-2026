//Hamiltonian path is present in it or not.
import java.io.*;
import java.util.*;

public class Solution {

    public static boolean dfs(int[][] mat, boolean[] vis, int current, int count, int n) {

        if(count == n) {
            return true;
        }

        for(int i = 1; i <= n; i++) {
            if(mat[current][i] == 1 && !vis[i]) {
                vis[i] = true;

                if(dfs(mat, vis, i, count + 1, n)) {
                    return true;
                }

                vis[i] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] mat = new int[N + 1][N + 1];

            for(int i = 0; i < M; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                mat[u][v] = 1;
                mat[v][u] = 1;
            }

            boolean result = false;

            for(int start = 1; start <= N; start++) {

                boolean[] vis = new boolean[N + 1];

                vis[start] = true;

                if(dfs(mat, vis, start, 1, N)) {
                    result = true;
                    break;
                }
            }

            if(result)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
