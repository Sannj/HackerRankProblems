package hackerrank;

/**
 * Created by sanjanabadam on 7/5/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int r, c, n;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        c = scan.nextInt();
        n = scan.nextInt();
        System.out.println(r+" "+c+" "+n);
        char[][] bomb = new char[r][c];
        String abc = scan.nextLine();
        for(int i = 0 ;i <r;i++){
             abc = scan.nextLine();
            int k = 0;
            for(int j = 0;j<c;j++){
                bomb[i][j] = abc.charAt(k);
                k++;
            }
        }
        n-=1;
        int step = 3;
        while(n>0){
            if(step == 3) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (bomb[i][j] != 'O') {
                            bomb[i][j] = '2';
                        }
                    }


                }
                n -= 1;
                step =4;
            }
            else if(step == 4){
                for(int i = 0;i<r;i++){
                    for(int j = 0;j<c;j++){
                        if(bomb[i][j] == 'O'){
                            bomb[i][j] = '.';
                            if(i==0){
                                if(j==0) {

                                    bomb[i+1][j] = '.';
                                    bomb[i][j+1] = '.';
                                }
                                else if(j==c-1){
                                    bomb[i+1][j] = '.';
                                    bomb[i][j-1] = '.';
                                }
                                else{
                                    bomb[i+1][j] = '.';
                                    bomb[i][j+1] = '.';
                                    bomb[i][j-1] = '.';
                                }
                            }
                            else if(i == r-1){
                                if(j==0){
                                    bomb[i-1][j] = '.';
                                    bomb[i][j+1] = '.';
                                }
                                else if(j==c-1){
                                    bomb[i-1][j] = '.';
                                    bomb[i][j-1] = '.';
                                }
                                else
                                {
                                    bomb[i-1][j] = '.';
                                    bomb[i][j+1] = '.';
                                    bomb[i][j-1] = '.';
                                }
                            }
                            else if(j==0){
                                if(i==0){
                                    bomb[i+1][j] = '.';
                                    bomb[i][j+1] = '.';
                                }
                                else if(i==r-1){
                                    bomb[i-1][j] = '.';
                                    bomb[i][j+1] = '.';
                                }
                                else{
                                    bomb[i + 1][j] = '.';
                                    bomb[i - 1][j] = '.';
                                    bomb[i][j + 1] = '.';
                                }
                            }
                            else if(j==c-1){
                                if(i==0){
                                    bomb[i+1][j] = '.';
                                    bomb[i][j-1] = '.';
                                }
                                else if(i==r-1){
                                    bomb[i-1][j] = '.';
                                    bomb[i][j-1] = '.';
                                }
                                else {
                                    bomb[i + 1][j] = '.';
                                    bomb[i - 1][j] = '.';
                                    bomb[i][j - 1] = '.';
                                }
                            }
                            else {
                                bomb[i + 1][j] = '.';
                                bomb[i - 1][j] = '.';
                                bomb[i][j + 1] = '.';
                                bomb[i][j - 1] = '.';
                            }
                        }

                    }
                }
                for(int i = 0;i<r;i++){
                    for(int j =0;j<c;j++){
                        if(bomb[i][j]=='2'){
                            bomb[i][j]='O';
                        }
                    }
                }
                n-=1;
                step =3;
            }
        }
        for(int i = 0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(bomb[i][j]);
            }
            System.out.println();
        }
    }



}