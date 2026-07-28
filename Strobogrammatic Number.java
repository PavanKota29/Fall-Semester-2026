//1.find Given number Strobogrammatic Number or not
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		HashMap<Character,Character> map = new HashMap<>();
		map.put('0','0');
		map.put('1','1');
		map.put('6','9');
		map.put('8','8');
		map.put('9','6');
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N.length();i++){
		    if(map.containsKey(N.charAt(i))){
		        sb.append(map.get(N.charAt(i)));
		    }else{
		        System.out.print("No");
		        return;
		    }
		}
		
		sb.reverse();
		String res = sb.toString();
		
		if(N.equals(res)){
		    System.out.print("Yes");
		}else{
		    System.out.print("No");
		}
	}
}

//2. find out all Strobogrammatic Number in low to high
import java.util.*;
public class Main
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int h = sc.nextInt();

		HashMap<Character,Character> map = new HashMap<>();
		map.put('0','0');
		map.put('1','1');
		map.put('6','9');
		map.put('8','8');
		map.put('9','6');

		for(int j=l; j<=h; j++) {
		    String N = String.valueOf(j);
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<N.length(); i++) {
				if(map.containsKey(N.charAt(i))) {
					sb.append(map.get(N.charAt(i)));
				} else {
					continue;
				}
			}

			sb.reverse();
			String res = sb.toString();

			if(N.equals(res)) {
				System.out.println(N);
			}
		}
	}
}
