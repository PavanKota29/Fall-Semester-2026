//Brutforce
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
       
        int maxProduct = 0;
        for(int i=0;i<N;i++){
            int currProduct = arr[i];
            maxProduct = Math.max(currProduct, maxProduct);
            for(int j=i+1;j<N;j++){
                currProduct *=arr[j];
                maxProduct = Math.max(maxProduct,currProduct);
            }
           
        }
        System.out.print(maxProduct);
    }
}



//Optimal
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
       
        int maxProduct = arr[0],max =arr[0],min = arr[0],temp=0;
        for(int i=1;i<N;i++){
            if(arr[i] > 0){
                max = Math.max(arr[i],max * arr[i]);
                min = Math.min(arr[i],min * arr[i]);
            }else if(arr[i] == 0){
                max = min = 0;
            }else{
                temp = max;
                max = Math.max(arr[i],min * arr[i]);
                min = Math.min(arr[i],temp * arr[i]);
            }
            maxProduct  = Math.max(maxProduct, max);
        }
        System.out.print(maxProduct);
    }
}



