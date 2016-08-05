package hackerrank;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by sanjanabadam on 6/1/16.
 */
public class MaxOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[] arr = new int[20];
        int count;
        int i = 0;
        while(n>0){
            arr[i]=n%2;
            i++;
            n = n/2;
        }
        count = 1;
        int max = 1;

        for(int j = 0;j<=i;j++){
       //  System.out.print(arr[j]);
            if(arr[j]==0){
                if(count>max){
                    max = count;

                }
                count = 1;
            }
            else{
                if(j==0){

                }
                else{
                    if(arr[j-1]==1){
                        count++;
                    }
                }
            }
        }
System.out.print(max);
    }
}
