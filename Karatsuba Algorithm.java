//Karatsuba Algorithm code (Hackerrank)
import java.util.*;
public class Main
{			      //1234    1234
    public static long solve(long x, long y){
        if(x < 10 || y < 10) return x * y;
        
        int len = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (len + 1) / 2;
        
        //1st
        long a = x / ((long) Math.pow(10,half));
        long b = x % ((long) Math.pow(10,half));
        long c = y / ((long) Math.pow(10,half));
        long d = y % ((long) Math.pow(10,half));
        
        //2nd
        long ac = solve(a,c);//144
        
        //3rd
        long bd = solve(b,d);//1156
        
        //4th
        long abcd = solve(a+b,c+d) - bd - ac;//816
        
        //5th 
        return (long) (ac * Math.pow(10,2 * half) + abcd * Math.pow(10,half) + bd);
                        //1440000 + 81600 + 1156 = 1522756 
    } 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long X = sc.nextLong();
	    long Y = sc.nextLong();
	    
	    System.out.print(solve(X,Y));
	}
}

//same type of question  (leetcode 43)
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();

        int[] res = new int[n1+n2];

        for(int i = n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int mul = a * b;

                int p1 = i+j,p2 = i+j+1;
                int sum = mul + res[p2];

                res[p2] = sum % 10;
                res[p1] += sum / 10;

            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : res){
            if(!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
