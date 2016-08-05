package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 5/22/16.
 */
public class TaxProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        int finalPercent = tipPercent+taxPercent;
        double percent = (double) finalPercent/100;
       double finalCost = mealCost+(mealCost*percent);


        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(finalCost);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}
