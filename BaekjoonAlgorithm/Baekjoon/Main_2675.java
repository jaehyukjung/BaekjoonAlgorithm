package Baekjoon;

import java.util.Scanner;

public class Main_2675 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[]=new int[N];
        String str[]= new String[N];

        for(int i=0;i<N;i++){
            num[i] = sc.nextInt();
            str[i] = sc.next();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<str[i].length();j++){
                for(int k = 0;k<num[i];k++) {
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
