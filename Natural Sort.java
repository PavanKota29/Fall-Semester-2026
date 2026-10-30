//Natural Sort using normal ways
import java.io.*;
import java.util.*;

class MySort implements Comparator<String>{
    public int compare(String s1, String s2){
        int i = 0,j = 0;
        while(i < s1.length() && j < s2.length()){
            if(Character.isDigit(s1.charAt(i)) &&
            Character.isDigit(s2.charAt(j))){
                //sort based on the number;  
                int num1 = 0,num2 = 0;
                while(i < s1.length() && 
                Character.isDigit(s1.charAt(i))){
                    num1 = num1 * 10 + (s1.charAt(i) - '0');
                    i++;
                }       
                
                while(j < s2.length() && 
                Character.isDigit(s2.charAt(j))){
                    num2 = num2 * 10 + (s2.charAt(j) - '0');
                    j++;
                }     
                
                if(num1 != num2){
                    return Integer.compare(num1, num2);
                }  
            }else{
                //sort based on the char
                char ch1 = s1.charAt(i);i++;
                char ch2 = s2.charAt(j);j++;
                if(ch1 != ch2) {
                    return Character.compare(ch1, ch2);
                }
            }
        }
        //sort based on the length of the string 
        return Integer.compare(s1.length(), s2.length());
    }
}

public class Solution {

    public static void main(String[] args) {
        String[] arr = new Scanner(System.in)
        .nextLine().split(" ");
        
        Arrays.sort(arr,new MySort());
        for(String s  : arr){
            System.out.print(s + " ");
        }
        
    }
}

//Natural sort using regex

import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] arr = input.split(" ");

        Pattern pattern = Pattern.compile("\\d+|\\D+");

        Arrays.sort(arr, (a, b) -> {

            Matcher ma = pattern.matcher(a);
            Matcher mb = pattern.matcher(b);

            while (ma.find() && mb.find()) {

                String sa = ma.group();
                String sb = mb.group();

                if (sa.matches("\\d+") && sb.matches("\\d+")) {

                    int x = Integer.parseInt(sa);
                    int y = Integer.parseInt(sb);

                    if (x != y) {
                        return Integer.compare(x, y);
                    }

                } else {

                    int result = sa.compareToIgnoreCase(sb);

                    if (result != 0) {
                        return result;
                    }
                }
            }

            return a.length() - b.length();
        });

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}


