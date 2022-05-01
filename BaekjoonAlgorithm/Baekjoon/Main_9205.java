package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9205 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            int ea = Integer.parseInt(br.readLine());
            int[][] home=new int[1][2];
            st = new StringTokenizer(br.readLine());
            home[0][0] =Integer.parseInt(st.nextToken());
            home[0][1] =Integer.parseInt(st.nextToken());
            int[][] store=new int[ea][2];
            for(int j = 0;j<ea;j++){
                st =new StringTokenizer(br.readLine());
                store[j][0] =Integer.parseInt(st.nextToken());
                store[j][1] =Integer.parseInt(st.nextToken());
            }
            int end[][] = new int[0][2];
            st =new StringTokenizer(br.readLine());
            end[0][0] =Integer.parseInt(st.nextToken());
            end[0][1] =Integer.parseInt(st.nextToken());


            int min = 1000;
            int next=0;
            int check[] =new int[ea];

            for(int j =0;j<ea;j++){
                for(int k=0;k<ea;k++){

                }
            }

            check[next]=1;

        }

    }
    static boolean bfs(int lst1[],int lst2[]){
        if(Math.abs(lst1[0]-lst2[0])+Math.abs(lst1[1]-lst2[1])<=1000){
            return true;
        }
        else return false;
    }
}
