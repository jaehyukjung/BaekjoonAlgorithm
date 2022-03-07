package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10870 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Fibo fi = new Fibo();
        int sum = fi.fibo(N);
        System.out.println(sum);
    }
}

class Fibo{
    int fibo(int N){
        if (N ==1) return 1;
        else if (N==0) return 0;
        else return fibo(N-1)+fibo(N-2);
    }

}