//with method toBinaryString() getting largest sequence of 1's  
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String s = Integer.toBinaryString(N);
	    System.out.println(s);
	    int maxLen = 0;
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i) == '1'){
	            count++;
	            if(count > maxLen){
	                maxLen = count;
	            }
	        }else{
	            count = 0;
	        }
	    }
	    System.out.println(maxLen);
	}
}


//with method toBinaryString() getting largest sequence of 1's after flipping one bit
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String s = Integer.toBinaryString(N);
	    System.out.println(s);
	    int maxLen = 0;
	    int currLen = 0;
	    int prevLen = 0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i) == '1'){
	            currLen++;
	        }else{
	            maxLen = Math.max(maxLen,currLen + prevLen + 1);
	            prevLen = currLen;
	            currLen = 0;
	        }
	    }
	    maxLen = Math.max(maxLen,currLen + prevLen + 1);
	    System.out.println(maxLen);
	}
}


//with using bitwise 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String s = Integer.toBinaryString(N);
	    System.out.println(s);
	    int maxLen = 0;
	    int count = 0;
	    while(N!=0){
	        if((N & 1) == 1){
	            count++;
	            if(count > maxLen) maxLen = count;
	        }else{
	            count = 0;
	        }
	        N >>= 1;
	    }
	    System.out.println(maxLen);
	}
}


//with bitwise after flipping one bit
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String s = Integer.toBinaryString(N);
	    System.out.println(s);
	    int maxLen = 0;
	    int currLen = 0;
	    int prevLen = 0;
	    while(N!=0){
	        if((N & 1) == 1){
	            currLen++;
	        }else{
	            maxLen = Math.max(maxLen,currLen + prevLen + 1);
	            prevLen = currLen;
	            currLen = 0;
	        }
	        N >>= 1;
	    }
	    maxLen = Math.max(maxLen,currLen + prevLen + 1);
	    System.out.println(maxLen);
	}
}  


