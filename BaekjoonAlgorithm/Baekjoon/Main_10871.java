package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = sc.nextInt();

//        for(int i=0;i<N;i++){
//            int num = sc.nextInt();
//            if(num<max){
//                System.out.print(num+" ");
//            }
//            else continue;
//        }

        int i=0;
        while(i<N){
            int num = sc.nextInt();
            if(num<max){
                System.out.print(num+" ");
            }
            else continue;
            i++;
        }
    }
}
