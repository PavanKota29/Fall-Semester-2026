//Move Hyphen 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '-'){
                res.insert(0,'-');
            }else{
                res.append(s.charAt(i));
            }
        }
        System.out.print(res.toString());
    }
}
