package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num !=0) st.push(num);
            else st.pop();
        }
        int sum=0;
        while(!st.isEmpty()){
            sum = sum+ st.pop();
        }
        System.out.println(sum);
    }
}
