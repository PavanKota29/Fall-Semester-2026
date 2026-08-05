//Approach 1

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = Integer.toBinaryString(N);
        String res = s;
        String rev = "";
        
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        
        if(rev.equals(res)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}

//Approach 2

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int rev = 0;
        
        while(temp != 0){
            rev = rev << 1;
            int lastBit = temp & 1;
            rev = rev | lastBit;
            temp = temp >> 1;
        }
        
        if(N == rev){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
