//Brutforce
import java.util.*;
public class Main
{
    public static void solve(int N,int[] arr,int k){
        if(k < 1) return;
        int temp = arr[0];
        for(int i=1;i<N;i++){
            arr[i-1] = arr[i];
        }
        arr[N-1] = temp;
        solve(N,arr,k-1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		int k = sc.nextInt();
		
		solve(N,arr,k%N);
		for(int i : arr) System.out.print(i+" ");
	}
}


//optimal solution
import java.util.*;
public class Main
{
    public static void solve(int N,int[] arr,int k){
        k = k % N;
        if(k == 0) return;
        int[] res = new int[N];
	int indx = 0;
        int indx = 0;
        for(int i=k;i<N;i++){
            res[indx++] = arr[i];
        }
        	
        for(int i = 0;i<k;i++){
            res[indx++] = arr[i];
        }
        for(int i : res) System.out.print(i+" ");
        arr = res;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		int k = sc.nextInt();
		
		solve(N,arr,k);
	
	}
}

//Hacker rank solution
import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int[] arr,int fi,int si,int K){
        for(int i=0;i<K;i++){
            int temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i] = temp;
        }
    }
    public static void solve(int[] arr,int N,int K){
        if(K == 0 || K == N)return;
        K = K % N;
        int a = K,b = N-K;
        
        while(a != b){
            if(a < b){
                swap(arr,K - a,K + b - a,a);
                b = b - a;
            }else{
                swap(arr,K-a,K,b);
                a = a - b;
            }
        }
        swap(arr,K-a,K,a);
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int K = sc.nextInt();
        int N = sc.nextInt();
        solve(arr,N,K);
        for(int i : arr) System.out.print(i+" ");
    }
}


