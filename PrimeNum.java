package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 6/22/16.
 */
public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n;i++){
            int num = scan.nextInt();
            if(num == 1){
                System.out.println("Not prime");
                continue;
            }
            int flag = 0;
            for(int j = 2;j<num/2;j++){
                if(num%j == 0){
                    System.out.println("Not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Prime");
            }
        }
    }
}
