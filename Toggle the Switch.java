//Approach 1
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean[] vis = new boolean[N+1];
      
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j+=i){
                vis[j] = !vis[j];
            }
        }
        int count = 0;
        for(int i=1;i<=N;i++){
            count+=(vis[i]) ? 1 : 0;
        }
        System.out.print(count);
    }
}

//Approach 2
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for(int i=1;i*i<=N;i++){
            count++;
        }
        System.out.print(count);
    }
}

//Approach 3
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print((int)Math.sqrt(N));
    }
}
