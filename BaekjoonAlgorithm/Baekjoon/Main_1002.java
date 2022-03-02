package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1002 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x1,y1,r1,x2,y2,r2,cnt = 0;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println(dist);
            if(dist==0 && r1==r2) {
                System.out.println(-1);
            }
            else if(dist > Math.abs(r2 - r1) && r1+r2>dist) {
                System.out.println(2);
            }
            else if(Math.abs(r2 - r1) == dist || r2 + r1 == dist) {
                System.out.println(1);
            }
            else if(r1+r2<dist || Math.abs(r2 - r1) > dist || dist == 0) {
                System.out.println(0);
            }
        }
    }
}
