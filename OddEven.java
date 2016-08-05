package hackerrank;

/**
 * Created by sanjanabadam on 5/23/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<t;i++){
            String cc = scan.nextLine();
            for(int j = 0;j<cc.length();j=j+2){
               System.out.print(cc.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1;j<cc.length();j=j+2){
                System.out.print(cc.charAt(j));
            }
            System.out.println();
        }
    }
}