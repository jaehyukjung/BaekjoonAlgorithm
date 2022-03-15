package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11047 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N[] = new int[Integer.parseInt(st.nextToken())];
        int money = Integer.parseInt(st.nextToken());
        int cnt=0;
        for(int i=0;i<N.length;i++){
            N[i]=Integer.parseInt(br.readLine());
        }
        for(int i=N.length-1;i>=0;i--){
            while(money>=N[i]){
                cnt++;
                money = money -N[i];
            }
        }
        System.out.println(cnt);
    }
}
