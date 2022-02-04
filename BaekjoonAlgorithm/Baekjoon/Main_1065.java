package Baekjoon;

import java.util.Scanner;


public class Main_1065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        if(N<100) cnt = N;

        else {
            cnt = 99;
            if(N==1000) N =999;

            for(int i=100;i<=N;i++){
                int hun = i / 100;
                int ten =(i/10)%10;
                int one = i%10;
                if((hun-ten) ==(ten-one)) cnt++;
            }
        }

        System.out.println(cnt);

    }

}