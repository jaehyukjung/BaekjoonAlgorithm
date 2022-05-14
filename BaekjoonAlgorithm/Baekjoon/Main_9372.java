package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_9372 {
    static int n;
    static boolean[] check;
    static ArrayList<Integer>[] lst;

    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            st =new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            int nea = Integer.parseInt(st.nextToken());
            lst =new ArrayList[n+1];

            for (int j=1;j<=n;j++){ //때용 배열안에 배열넣는게 가능하다니...
                lst[i] = new ArrayList<Integer>();
            }

            for (int j=0;j<nea;j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                lst[a].add(b);
                lst[b].add(a);
            }
            bfs(1);

            int cnt =0;
            for (boolean b : check) {
                if(b==true) cnt++;
            }
            System.out.println(cnt);
        }
    }
    private static void bfs(int v){

        if(check[v]){
            return;
        }
        check[v]=true;
        for (int i:lst[v]){
            if(!check[i]){
                bfs(i);
            }
        }
    }
}
