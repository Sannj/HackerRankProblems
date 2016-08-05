package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 6/28/16.
 */
public class Arrays2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int sum = 0;
        int count = 0;
        int max = 0;
        int flag = 0;
        for (int row = 0;row<4;row++) {
            for(int column = 0;column <4;column++){
                sum = 0;
                count = 0;
            for (int i = row; i < row+3; i++) {

                for (int j = column; j < column+3; j++) {

                    if(count == 3 || count == 5){

                    }
                    else {
                        sum += arr[i][j];

                    }
                 //   System.out.print(arr[i][j] + " ");
                    count++;
                }

           //     System.out.println();
            }
                if(flag == 0){
                    max = sum;
                    flag++;
                }
                if(sum>max){
                    max = sum;
                }
         //       System.out.println(sum);

       //     System.out.println();
       //     System.out.println();
        }

    }
        System.out.println(max);
    }
}
