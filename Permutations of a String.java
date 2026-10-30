//Permutations of a String(only work with unique character)
import java.util.*;

public class Main {
    public static List<String> li = new ArrayList<>();
    public static void swap(char[] arr,int indx,int i){
        char ch = arr[indx];
        arr[indx]  = arr[i];
        arr[i] = ch;
    }
    public static void solve(char[] arr,int indx,int N){
        //base case
        if(indx == N){
            li.add(new String(arr));
            return;
        }
        for(int i=indx;i<N;i++){ 
            swap(arr,indx,i);
            solve(arr, indx+1, N);
            swap(arr,indx,i);//backtrack
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[]  arr=s.toCharArray();

        solve(arr,0,s.length());
        for(String s1 : li) System.out.println(s1);
    }
}

//Permutations of a String (work with dublicate character)

import java.util.*;

public class Main {
    public static List<String> li = new ArrayList<>();
    public static void swap(char[] arr,int indx,int i){
        char ch = arr[indx];
        arr[indx]  = arr[i];
        arr[i] = ch;
    }
    public static void solve(char[] arr,int indx,int N){
        //base case
        if(indx == N){
            li.add(new String(arr));
            return;
        }
        //HashSet<Character> hs = new HashSet<>();
        for(int i=indx;i<N;i++){
             if(hs.contains(arr[i])){
                 continue;
             }
            hs.add(arr[i]);
            swap(arr,indx,i);
            solve(arr, indx+1, N);
            swap(arr,indx,i);//backtrack
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[]  arr=s.toCharArray();

        solve(arr,0,s.length());
        for(String s1 : li) System.out.println(s1);
    }
}

