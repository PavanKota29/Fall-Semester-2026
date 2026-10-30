import java.io.*;
import java.util.*;

public class Solution {
    public static void solve(int[] arr,int indx,List<Integer> li,
    int sum,int N){
        //base case
        if(sum < 0) return;
        if(sum == 0){
            for(int i : li) System.out.print(i+" ");
            System.out.println();
            return;
        }
        
        for(int i=indx;i<N;i++){
            li.add(arr[i]);
            solve(arr, i, li, sum - arr[i], N);
            li.remove(li.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        int sum = sc.nextInt();
        
        List<Integer> li = new ArrayList<>();
        
        solve(arr,0,li,sum,N);
    }
}
