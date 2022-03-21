package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1427 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        char[] arr = new char[N.length()];

        for(int i=0;i<arr.length;i++){
            arr[i]=N.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
