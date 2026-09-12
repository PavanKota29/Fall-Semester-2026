import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        int[] fq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            fq[ch - 'a']++;
        }
       
        int oddCount = 0;
        char midChar = '#';
       
        for(int i=0;i<26;i++){
            if(fq[i] % 2 != 0){
                oddCount++;
                midChar = (char)(i+'a');
            }
        }
       
        if(oddCount > 1){
            System.out.print(-1);
            return;
        }
       
        StringBuilder left = new StringBuilder();
       
        for(int i=0;i<26;i++){
            for(int j=0;j<fq[i]/2;j++){
                left.append((char)(i + 'a'));
            }
        }
       
        StringBuilder right = new StringBuilder(left);
       
        right.reverse();
       
       
        String res = left.toString() +
        ((oddCount == 1) ? midChar : "")+
        right.toString();
       
        System.out.println("Result : "+res);
    }
}

