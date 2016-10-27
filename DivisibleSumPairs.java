package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 10/26/16.
 * https://www.hackerrank.com/challenges/divisible-sum-pairs
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if((a[i] + a[j])%k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
