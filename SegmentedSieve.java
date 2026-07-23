import java.util.*;
public class Main
{
    public static ArrayList<Integer> Sieve(int N){
        boolean[] isPrime = new boolean[N+1];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=2;i<=N;i++){
            if(isPrime[i] == false){
                arr.add(i);
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j] = true;
                }
            }
        }
        return arr;
    }
    public static void segmentedSieve(int l,int h){
        int sq = (int) Math.sqrt(h);
        ArrayList<Integer> prime = Sieve(sq);
        
        boolean[] isPrime = new boolean[h - l + 1];
        
        for(int p:prime){
            int sm = (l/p)*p;
            if(sm < l){
                sm += p;
            }
            for(int i = sm;i<=h;i+=p){
                isPrime[i-l] = true;
            }
        }
        
        for(int i=l;i<=h;i++){
            if(isPrime[i-l] == false){
                System.out.print(i+" ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int h=sc.nextInt();
	    
	    segmentedSieve(l,h);
		
	}
}
