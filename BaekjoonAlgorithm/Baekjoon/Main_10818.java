package Baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_10818 {
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<N;i++){
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }

        System.out.println(min+" "+max);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();



        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[0]+" "+arr[N-1]);


    }
}
