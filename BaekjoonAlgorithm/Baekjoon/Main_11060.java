package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11060 {
    public  static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt =0;
        int i=0;
        while(i<N-1){
            int max =0;
            for(int j=1;j<arr[i]+1;j++){
                if(i+j<N && max < j+arr[i+j] && arr[i+j]!=0) max = j;
                if( i+j == N) break;
            }
            i = i+max;
            cnt ++;
            if( i == N) break;

        }
        System.out.println(cnt);
    }
}
