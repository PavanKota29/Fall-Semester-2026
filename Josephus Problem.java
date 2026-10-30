//Josephus Problem (using list)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<=N;i++) li.add(i);
        
        int indx = 0;
        while(li.size() > 1){
            indx = (indx + k -1) % li.size();
            li.remove(indx);
        }
        System.out.print(li.get(0));
    }
}


//Josephus Problem (using recursion)
import java.io.*;
import java.util.*;

public class Solution {
    
    public static int solve(int N,int k){
        //base case
        if(N == 0) return 0;
        
        return (solve(N-1,k) + k) % N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        
        System.out.print(solve(N,k)+1);
    }
}
