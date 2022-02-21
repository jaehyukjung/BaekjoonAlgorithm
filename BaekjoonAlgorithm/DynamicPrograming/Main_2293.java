package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2293 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int coin[] =new int[N];
        for(int i=0;i<N;i++){
            coin[i]= Integer.parseInt(br.readLine());
        }

        int cnt =0;
        int coinN[]=new int[N];
        for(int i=0;i<N;i++){
            coinN[i]= K/coin[i];
        }
        for(int i=0;i<=coinN[0];i++){
            for(int j=0;j<=coinN[1];j++){
                for(int k=0;k<=coinN[2];k++){
                    if(coin[0]*i+coin[1]*j+coin[2]*k==K) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
