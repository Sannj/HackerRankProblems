package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 10/26/16.
 */
public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int m = 5, x;
        int s = 0;
        while(i < n){
            x = (m/2) * 3;
            s = s+ (m/2);
            m = x;
            i++;
        }

        System.out.println(s);
    }


}
