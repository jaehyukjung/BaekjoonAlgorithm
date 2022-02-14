package Baekjoon;

import java.util.Scanner;

public class Main_1712 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        long P = sc.nextInt();
        long V = sc.nextInt();
        long C = sc.nextInt();

        if((C-V)>0) System.out.println(P/(C-V)+1);
        else System.out.println(-1);
    }
}
