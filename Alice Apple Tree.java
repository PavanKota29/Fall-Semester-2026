//find out Perimeter of given Number of apple.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int apple = 0;
        int M = 0;
        while(apple < N){
            M++;
            apple = apple + (12 * M * M);
        }
        System.out.print(4*2*M);
    }
}
