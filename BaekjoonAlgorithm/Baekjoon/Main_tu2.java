package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main_tu2 {
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[40];
        int num =1;
        int i =0; // 배열에 들어가는 인덱스 번호.
        while(true){

            num = sc. nextInt();
            if(num ==0) break;
            else{
                arr[i]= num;
                i++;
            }
        }
        for(int j=0;j<i;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        int max = 0;
        for(int j=0;j<i;j++){
            if(max<=arr[j]) max= arr[j];
        }
        System.out.println(max);
        for(int j=0;j<i;j++){
            if(arr[j]==max) {
                int temp=arr[j];
                arr[j]=arr[i-1];
                arr[i-1] =temp;
            }
        }

        for(int j=0;j<i;j++){
            System.out.print(arr[j]+" ");
        }

        sc.close();

    }
}
