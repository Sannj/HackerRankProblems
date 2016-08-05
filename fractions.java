package hackerrank;

/**
 * Created by sanjanabadam on 5/20/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fractions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pcount = 0, ncount = 0, zcount = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                pcount++;
            }
            else if(arr[arr_i]<0){
                ncount++;
            }
            else
                zcount++;
        }
        double fp=0.0,np,zp;
        fp = (double) pcount/n;
        np = ncount/n;
        zp = zcount/n;
        System.out.println(fp);
        System.out.println(np);
        System.out.println(zp);
    }
}
