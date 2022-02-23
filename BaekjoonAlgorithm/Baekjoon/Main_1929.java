package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Main_1929 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        if(M == 1) {
            M += 1;
        }
        else if (M == 0) {
            M += 2;
        }
        for(int i=M;i<=N;i++){
            int cnt =0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0) cnt++;
            }
            if(cnt==1 || cnt ==0) {
                System.out.println(i);
            }
        }
    }
}
