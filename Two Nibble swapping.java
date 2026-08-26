//Nibble swapping using hexadecimal Number.(0x0F,0xF0)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int lowernibble = (N & 0x0F);//0x0F -> 15;
        lowernibble <<= 4;
        
        int uppernibble = (N & 0xF0);//0xF0 -> 240
        uppernibble >>=4;
        
        System.out.print(lowernibble | uppernibble);
         
    }
}

//Nibble swapping using Binary Number.(0b00001111,0b11110000)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int lowernibble = (N & 0b00001111);//0b00001111 -> 15;
        lowernibble <<= 4;
        
        int uppernibble = (N & 0b11110000);//0b11110000 -> 240
        uppernibble >>=4;
        
        System.out.print(lowernibble | uppernibble);
         
    }
}

//Nibble swapping using decimal Number.(15,240)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int lowernibble = (N & 15);
        lowernibble <<= 4;
        
        int uppernibble = (N & 240);
        uppernibble >>=4;
        
        System.out.print(lowernibble | uppernibble);
         
    }
}

//Nibble swapping using / , % oparater
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a = N % 16;
        int b = N / 16;
        int res = a * 16 + b;
        
        System.out.print(res);
         
    }
}

