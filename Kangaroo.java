package hackerrank;

/**
 * Created by sanjanabadam on 10/26/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int i = x1;
        int j = x2;
        if((x2 > x1) && (v2 > v1)){
            System.out.println("NO");
            return;
        }
        if((x1 > x2) && (v1 > v2)) {
            System.out.println("NO");
            return;
        }

        if(i >= j){
            while(i > j){
                if(i==j){
                    System.out.println("YES");
                    return;
                }
                else{
                    i += v1;
                    j += v2;
                }
            }

            System.out.println("NO");
        }
        else{
            while(i <= j){
                if(i==j){
                    System.out.println("YES");
                    return;
                }
                else{
                    i += v1;
                    j += v2;
                }
            }

            System.out.println("NO");
        }



    }
}
