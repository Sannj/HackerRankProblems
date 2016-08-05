package hackerrank;

/**
 * Created by sanjanabadam on 5/20/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count;
        for(int i =0;i<n;i++){
            count = n;
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
                count--;
            }
            for(int k =0;k<count;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
