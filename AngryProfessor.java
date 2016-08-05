package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 5/21/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int pcount = 0;
            int ncount = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i] <= 0){
                    ncount++;

                }
                else {
                    pcount++;
                }
            }
            System.out.println(k+"\n"+ncount+"\n"+pcount);
            if(ncount >= k) {
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }

    }
}
