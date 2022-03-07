package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10872 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N==0) System.out.println(1);
        else{
            int pac = 1;
            for(int i=0;i<N;i++){
                pac = pac *(N-i);
            }
            System.out.println(pac);
        }
    }
}
