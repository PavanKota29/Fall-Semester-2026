import java.io.*;
import java.util.*;

public class Solution {
    
    public static String solve(String s){
        if(s.length() == 0 || s == null) return "";
        
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        for(char ch : s.toCharArray()){
            sb.append('#').append(ch);
        }
        sb.append("#$");
        
        String t = sb.toString();
        int N = t.length();
        int[] p = new int[N];
        
        int center = 0,maxRight = 0;
        int maxLen = 0,start=0;
        
        for(int i=1;i<N-1;i++){
            if(i < maxRight){
                int mirror = 2 * center - i;
                p[i] = Math.min(maxRight - i,p[mirror]);
            }
            while(t.charAt(i+p[i]+1) == t.charAt(i-p[i]-1)){
                p[i]++;
            }
            if(i+p[i] > maxRight){
                center = i;
                maxRight = i + p[i];
            }
            
            if(p[i] > maxLen){
                maxLen = p[i];
                start = (i - p[i] - 1) / 2;
            }
        }
        return s.substring(start,start+maxLen);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.print(solve(s));
    }
}
