//Brutforce
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);       
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).
        mapToInt(Integer::parseInt).toArray();
        int N = arr.length;
       
        int maxSum = 0;
        for(int i=0;i<N;i++){
            int prefix = 0;
            for(int j= i;j>=0;j--) prefix += arr[j];
           
            int sufix = 0;
            for(int j= i;j<N;j++) sufix += arr[j];
            if(prefix == sufix){
                maxSum = Math.max(prefix,maxSum);
            }
        }
        System.out.print(maxSum);
       
    }
}


//optimal
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);       
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).
        mapToInt(Integer::parseInt).toArray();
        int N = arr.length;
       
        int totalSum = 0;
        for(int i : arr) totalSum += i;
       
        int maxSum = 0;
        int prefix = 0;
        for(int i=0;i<N;i++){
            prefix += arr[i];
            int sufix = totalSum - prefix + arr[i];
            if(prefix == sufix){
                maxSum = Math.max(prefix,maxSum);
            }
        }
        System.out.print(maxSum);
       
    }
}







