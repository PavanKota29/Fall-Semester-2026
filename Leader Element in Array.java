//1st Leader Element in Array (with bruteforce) (TC - O(N^2),SP - O(1)) HackerRank Solution
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++) arr[i] = sc.nextInt();
            
            for(int i=0;i<N;i++){
                boolean flag = true;
                for(int j=i+1;j<N;j++){
                    if(arr[i] < arr[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

//1st Leader Element in Array (with Optimal) (TC - O(N),SP - O(N))  HackerRank Solution
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++) arr[i] = sc.nextInt();
            
            ArrayList<Integer> li = new ArrayList<>();
            int maxRight = arr[N-1];
            li.add(maxRight);
            for(int i=N-2;i>=0;i--){
                if(arr[i] >= maxRight){
                    maxRight = arr[i];
                    li.add(maxRight);
                }
            }
            for(int i=li.size()-1;i>=0;i--){
                System.out.print(li.get(i)+" ");
            }
            System.out.println();
        }
    }
}

