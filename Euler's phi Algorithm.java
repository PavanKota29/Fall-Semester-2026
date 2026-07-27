//1. using GCD
import java.util.*;
public class Main
{
    public static int GCD(int a,int b){
        for(int i=a;i>1;i--){
            if(a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    int count = 0;
	    for(int i=1;i<=N;i++){
	        if(GCD(i,N)==1) count++;
	    }
	    System.out.print(count);
	}
}

//2.using remove multiple of prime facters
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    int res = N;
	    
	    for(int p=2;p<=Math.sqrt(N);p++){
	        if(N%p == 0){
	            while(N%p==0){
	                N=N/p;
	            }
	            res = res - (res/p);
	        }
	    }
	    if(N > 1){
	        res = res - (res/N);
	    }
	    System.out.print(res);
	    
	}
}

