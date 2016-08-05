    package hackerrank;

    /**
     * Created by sanjanabadam on 6/17/16.
     */
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    public class ArraySwaps {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int a[] = new int[n];
                for(int a_i=0; a_i < n; a_i++){
                    a[a_i] = in.nextInt();
                }
                int swaps = 0;
                for(int i = 0; i<a.length;i++){
                    for(int j = 0; j <a.length-1;j++){
                        if (a[j] > a[j+1]) {
                            int temp = a[j];
                            a[j] = a[j+1];
                            a[j+1] = temp;
                            swaps++;
                        }
                    }
                }
                for(int i = 0;i<n;i++){
                    System.out.print(a[i]);
                }
                System.out.println("Array is sorted in "+swaps+" swaps.");
                System.out.println("First Element: "+a[0]);
                System.out.println("Last Element: "+a[n-1]);
            }


    }
