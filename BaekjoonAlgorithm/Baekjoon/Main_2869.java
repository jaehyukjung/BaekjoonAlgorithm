package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int point=0;
        int day=(V-B)/(A-B);
        if((V-B)%(A-B)!=0) day++;
        System.out.println(day);
        /*while(point<V){
            point = point+A;
            if(point>=V) break;
            else {
                point = point -B;
                day++;
            }
        }*/

    }
}
