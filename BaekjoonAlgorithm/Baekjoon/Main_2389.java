package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2389 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = N/5;
        x+=1;
        while(x>=0){
            for(int j=0;3*j<(N-5*x);j++){
                if((N-5*x)-3*j==0);
                System.out.println(x+j);
                break;
            }
            x--;
        }
    }
}
