package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main_2012 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int lst[] = new int[n];

        for(int i =0;i<n;i++){
            lst[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lst);
        int result = 0;

        for(int i=1;i<n+1;i++){
            if(lst[i-1] - i > 0){
                result += lst[i-1]-i;
            }
            else{
                result += i - lst[i-1];
            }
        }
        System.out.println(result);
    }
}
