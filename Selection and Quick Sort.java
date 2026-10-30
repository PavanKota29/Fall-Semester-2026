//Selection sort
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        
        for(int i=N-1;i>=0;i--){
            int maxIndx = i;
            for(int j=i-1;j>=0;j--){
                if(arr[j] >= arr[maxIndx]){
                    maxIndx = j;
                }
            }
            int temp = arr[maxIndx];
            arr[maxIndx] = arr[i];
            arr[i] = temp;
        }
        for(int i : arr) System.out.print(i+" ");
    }
}

//Quick Sort(1st element as pivot)
import java.io.*;
import java.util.*;

public class Solution {
    
    public static int sort(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while(i <= j){
            while(i <= j && arr[i] <= pivot) i++;
            while(i <= j && arr[j] > pivot) j--;
            
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }    
    
    public static void solve(int[] arr,int low,int high){
        if(low < high){
            int pivotIndx = sort(arr,low,high);
            solve(arr,low,pivotIndx - 1);
            solve(arr,pivotIndx + 1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        solve(arr,0,N-1);
        for(int i : arr) System.out.print(i+" ");
    }
}

//Quick Sort(last element as pivot)
import java.io.*;
import java.util.*;

public class Solution {
    
    public static int sort(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low;
        int j = high-1;
        while(i <= j){
            while(i <= j && arr[i] <= pivot) i++;
            while(i <= j && arr[j] > pivot) j--;
            
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }    
    
    public static void solve(int[] arr,int low,int high){
        if(low < high){
            int pivotIndx = sort(arr,low,high);
            solve(arr,low,pivotIndx - 1);
            solve(arr,pivotIndx + 1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        solve(arr,0,N-1);
        for(int i : arr) System.out.print(i+" ");
    }
}
