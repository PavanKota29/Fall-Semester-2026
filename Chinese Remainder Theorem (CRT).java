import java.util.*;
public class Main
{
    public static int Inverse(int Mn,int m){
        int x = 1;
        while(true){
            if(Mn * x % m == 1) return x;
            x++;
        }
    }
    
    public static int solve(int n,int a[],int mod[]){
        //find M
        int M = 1;
        for(int i : mod) M = M * i;
        
        //find X
        int res = 0;
        for(int i=0;i<n;i++){
            //find M1 M2 M3 ... Mn
            int Mm = M / mod[i];
            //find M1-1 M2-1 M3-1 ... Mn-1
            int mn = Inverse(Mm,mod[i]);
            res += (a[i]*Mm*mn);
        }
        return res % M;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of equations :");
		int K = sc.nextInt();
		int[] a = new int[K];
		int[] mod = new int[K];
		
		System.out.println("Enter a1 a2 a3...an:");
		for(int i=0;i<K;i++){
		    a[i] = sc.nextInt();
		}
		System.out.println("Enter m1 m2 m3 ... mn:");
		for(int i=0;i<K;i++){
		    mod[i] = sc.nextInt();
		}
		
		int res = solve(K,a,mod);
		System.out.println("Result : "+ res);
	}
}
