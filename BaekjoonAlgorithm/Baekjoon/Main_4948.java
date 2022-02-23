package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4948 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=0;
        int cnt =0;
        int ea = 0;
        do{
            N = Integer.parseInt(br.readLine());
            if(N ==0) break;
            else{
                ea = 0;
                for(int i=N+1;i<=2*N;i++){
                    cnt =0;
                    for(int j=1;j*j<=i;j++){
                        if(i%j==0) cnt++;
                        if(cnt>1) break;
                    }
                    if(cnt==1) ea++;
                }
                System.out.println(ea);
            }
        }while (N!=0);
    }
}
