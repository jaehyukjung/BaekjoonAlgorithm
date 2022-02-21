package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11653 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i=2;
        while(true){
            if(N==1) break;
            else if(N%i==0){
                N = N/i;
                System.out.println(i);
            }
            else {
                i++;
            }
        }
    }
}
