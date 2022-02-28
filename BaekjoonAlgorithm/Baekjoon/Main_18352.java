package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18352 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N,M,K,X;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        int d[][]= new int[N+1][N+1];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int start= Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            d[start][end]=1;
        }
        for (int i = 1; i <= N; i++){
            for(int j = 1;j<=N;j++){

            }
        }
    }
}
