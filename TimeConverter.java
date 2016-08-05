package hackerrank;

/**
 * Created by sanjanabadam on 5/20/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        char a = time.charAt(time.length()-2);
        if(a == 'P'){
            char h1 = time.charAt(0);
            char h2 = time.charAt(1);
            String s = new StringBuilder().append(h1).append(h2).toString();
            int hour = Integer.parseInt(s);
            if(hour == 12){
                String sub = time.substring(0,8);
                System.out.print(sub);
            }
            else {
                hour += 12;
                String newS = String.valueOf(hour);
                String sub = time.substring(2, 8);
                String finalS = newS + sub;
                System.out.print(finalS);
            }
        }
        else{
            char h1 = time.charAt(0);
            char h2 = time.charAt(1);
            String s = new StringBuilder().append(h1).append(h2).toString();
            int hour = Integer.parseInt(s);
            String finalS;
            if(hour == 12){
                finalS = "00";
                String sub = time.substring(2, 8);
                finalS += sub;
                System.out.println(finalS);
            }
            else {
                String sub = time.substring(0, 8);
                System.out.print(sub);
            }
        }

    }
}

