package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main_2480 {
    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0;i<N;i++){//0
            for(int j=0;j<(4-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

