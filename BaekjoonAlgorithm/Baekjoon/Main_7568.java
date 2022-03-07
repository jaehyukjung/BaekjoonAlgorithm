package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_7568 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[][] =new int[N][2];
        int cnt[]=new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]= Integer.parseInt(st.nextToken());
            cnt[i]=1;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if (i!=j && arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) cnt[i]++;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(cnt[i]+" ");
        }
    }
}
