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
       
        for(int i=0;i<N;i++){
            int curr = arr[i];
            int count = 0;
            for(int j=i;j<N;j++){
                if(curr == arr[j]) count++;
            }
            if(count >= N / 2){
                System.out.print(curr);
                break;
            }
        }
    }
}



//optimal
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
       
        int count = 0,majority = 0;
        for(int i=0;i<N;i++){
            if(count == 0){
                count = 1;
                majority = arr[i];
            }else{
                if(majority == arr[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        System.out.print(majority);
    }
}





//optimal
import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
       
        int mid = N / 2;
        Arrays.sort(arr);
        System.out.print(arr[mid]);
    }
}




