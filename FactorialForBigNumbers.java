package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sanjanabadam on 9/8/16.
 */
public class FactorialForBigNumbers {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);

    }


}
