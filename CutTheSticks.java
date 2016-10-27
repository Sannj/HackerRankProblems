package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 10/26/16.
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            int min = mini(a);
            if(checkZeroes(a)){
               break;
            }
            System.out.println(nonZeroValues(a));
            for(int j = 0; j < n; j++){
                if(a[j] > 0){
                    a[j] = a[j] - min;
                }
            }
        }


    }

    public static int mini(int[] a){
        int l = a.length;
        int min = Integer.MAX_VALUE;
        int j = 0;
        while(j < l){
            if(a[j] > 0){
                min = a[j];
                break;
            }
            j++;
        }

        for(int i = 1; i < l; i++){
            if(a[i] < min && a[i] > 0) {
                min = a[i];

            }
        }
        return min;
    }

    public static int nonZeroValues(int[] a){
        int l = a.length;
        int count = 0;
        for(int i =0; i < l; i++){
            if(a[i] > 0){
                count++;
            }
        }
        return count;
    }

    public static boolean checkZeroes(int[] a){
        int l = a.length;
        for(int i = 0; i < l; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
