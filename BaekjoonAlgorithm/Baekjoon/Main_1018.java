package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String arr[] = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        int cnt1 =0;
        for(int i=0;i<N;i++){
            for(int j =0;j<M;j++){
                if(i%2==0 && j%2==0){
                    if(arr[i].charAt(j)!='W') cnt1++;
                }
                else if(i%2==0 && j%2!=0){
                    if(arr[i].charAt(j)!='B') cnt1++;
                }
                else if(i%2!=0 && j%2==0){
                    if(arr[i].charAt(j)!='B') cnt1++;
                }
                else if(i%2!=0 && j%2!=0){
                    if(arr[i].charAt(j)!='W') cnt1++;
                }
            }
        }
        int cnt2 =0;
        for(int i=0;i<N;i++){
            for(int j =0;j<M;j++){
                if(i%2==0 && j%2==0){
                    if(arr[i].charAt(j)!='B') cnt2++;
                }
                else if(i%2==0 && j%2!=0){
                    if(arr[i].charAt(j)!='W') cnt2++;
                }
                else if(i%2!=0 && j%2==0){
                    if(arr[i].charAt(j)!='W') cnt2++;
                }
                else if(i%2!=0 && j%2!=0){
                    if(arr[i].charAt(j)!='B') cnt2++;
                }
            }
        }

        System.out.println(Math.min(cnt1,cnt2));
    }
}
