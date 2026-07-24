import java.util.*;
public class Main
{
    public static ArrayList<Integer> Sieve(int N){
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        
        for(int i=2;i<=N;i++){
            if(isPrime[i] == true){
                prime.add(i);
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        return prime;
    }
    
    public static void segmentedSieve(int l,int h){
        //1st
        int sq = (int) Math.sqrt(h);
        ArrayList<Integer> prime = Sieve(sq);
        
        //2nd
        boolean[] isPrime = new boolean[h-l+1];
        Arrays.fill(isPrime,true);
        
        //3rd
        for(int p : prime){
            int sm = Math.max(p*p,((l+p-1)/p)*p);
            for(int i = sm;i<=h;i+=p){
                isPrime[i-l] = false;
            }
        }
        for(int i=l;i<=h;i++){
            if(isPrime[i-l] == true)
            {
                System.out.print(i+" ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int h = sc.nextInt();
		
		segmentedSieve(l,h);
	}
}
