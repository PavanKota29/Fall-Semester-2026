//1. using looping (Bruteforce)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int GCD = 1;
        for(int i=1;i<=Math.min(A,B);i++){
            if(A%i == 0 && B%i == 0){
                GCD = i;
            }
        }
        System.out.print(GCD);
    }
}

//2. Euclidean algorithm (With Recursion)
import java.io.*;
import java.util.*;

public class Solution {
    public static int GCD(int A,int B){
        //base case
        if(B==0) return A;
        
        return GCD(B, A%B);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int temp1 = Math.max(A,B);
        int temp2 = Math.min(A,B);
        A = temp1;
        B = temp2;
        System.out.print(GCD(A,B));
    }
}

//3. Euclidean algorithm (With Iteration)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int temp1 = Math.max(A,B);
        int temp2 = Math.min(A,B);
        A = temp1;
        B = temp2;        
        while(B!=0){
            int temp = B;
            B = A%B;
            A = temp;
        }
        System.out.print(A);
         }
}

