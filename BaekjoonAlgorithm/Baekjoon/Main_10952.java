package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main_10952 {
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(true){

            int A=sc.nextInt();
            int B=sc.nextInt();

            if(A==0 && B==0){
                break;
            }
            System.out.println(A+B);
        }
        sc.close();
    }
}
