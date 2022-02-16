package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1463 {
    public static int dp[];
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        dp=new int[N+1]; //초기값 0
        System.out.println(Dynamic(N));

    }
    public static int Dynamic(int N){
        if(N==1) return 0;
        if(dp[N]>0) return dp[N];
        dp[N] = Dynamic(N-1)+1;
        if(N%3==0) dp[N] = Math.min(dp[N],Dynamic(N/3) +1);
        if(N%2==0) dp[N] = Math.min(dp[N],Dynamic(N/2) +1);
        return dp[N];

    }

}
