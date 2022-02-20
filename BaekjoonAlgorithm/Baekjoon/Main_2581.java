package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2581 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int M= sc.nextInt();
        int N= sc.nextInt();
        int arr[]=new int[N-M+1];
        int cnt =0;
        int sum = 0;
        for(int i=M;i<=N;i++){
            for(int j=1;j<i;j++){
                if(i%j==0) cnt++;
            }
            if(cnt==1) {
                arr[i-M] = i;
                sum = sum + i;
            }
            cnt=0;
        }
        if(sum>0){
            System.out.println(sum);
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0) cnt++;
            }
            System.out.println(arr[cnt]);
        }
        else System.out.println(-1);
    }
}
