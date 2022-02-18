package Baekjoon;

import java.util.Scanner;

public class Main_2775 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[][]=new int[15][15];
        for(int i=0;i<15;i++) {
            arr[i][0]=1;
            arr[0][i]=i+1;
        }
        int cnt = 0;
        int arr1[] =new int[t];
        while(cnt<t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<b;j++){
                    arr[i][j] =arr[i-1][j]+arr[i][j-1];
                }
            }
            System.out.println(arr[a][b-1]);
            cnt++;
        }
    }
}
