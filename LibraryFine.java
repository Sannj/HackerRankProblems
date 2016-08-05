package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 6/22/16.
 */
public class LibraryFine {
    public static void main(String[] args) {
        int ad, am,ay, ed,em,ey;
        int fine=0;
        Scanner scan = new Scanner(System.in);
        ad = scan.nextInt();
        am = scan.nextInt();
        ay = scan.nextInt();
        ed = scan.nextInt();
        em = scan.nextInt();
        ey = scan.nextInt();
        if(ay == ey){
            if(am == em){
                if(ad <= ed){
                    fine = 0;
                }
                else {
                    fine = 15 * (ad-ed);
                }
            }
            if(am<em){
                fine = 0;
            }
            if(am>em){
               fine = 500 * (am - em);
            }
        }
        else if(ay<ey){
            fine = 0;
        }
        else {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
