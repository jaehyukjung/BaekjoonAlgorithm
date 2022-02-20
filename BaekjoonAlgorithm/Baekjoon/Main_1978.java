package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] argv) throws IOException{
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int cnt =0;
        int ea = 0;
        for(int i=0;i<N;i++){
            if(arr[i]==0) ea++;
            else{
                for(int j=1;j<arr[i];j++){
                    if(arr[i]%j==0) cnt++;
                }
                if(cnt==1) ea++;
                cnt=0;
            }
        }
        System.out.println(ea);
    }
}
