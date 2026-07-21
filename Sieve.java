import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<=N;i++){
            if(isPrime[i] == true){
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j] = false;
                }
            }            
        }
        for(int i=2;i<=N;i++){
            if(isPrime[i] == true){
                System.out.print(i+ " ");
            }
        }
    }
}
