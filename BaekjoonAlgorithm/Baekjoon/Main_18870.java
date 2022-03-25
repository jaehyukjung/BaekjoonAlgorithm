package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18870 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] cnt = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int same=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i!=j && arr[i]>arr[j]){
                    for(int k=0;k<j;k++){
                        if(arr[j]==arr[k]) same++;
                    }
                    if(same==0) cnt[i]++;
                    same=0;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(cnt[i] +" ");
        }
    }
}
