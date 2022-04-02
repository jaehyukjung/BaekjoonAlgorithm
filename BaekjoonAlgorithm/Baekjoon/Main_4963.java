package Baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main_4963 {
    static int N,M;
    static int map[][];
    static boolean visits[][];
    static int dx[] = {-1,0,0,1,-1,1,-1,1};
    static int dy[] = {0,1,-1,0,-1,-1,1,1};
    static ArrayList<Integer> count;
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(System.in);
        count = new ArrayList<>();

        do{

            M = sc.nextInt();
            N = sc.nextInt();
            map = new int[N][M];
            for(int i=0; i<N; i++) {

                for (int j = 0; j<M; j++) {
                    map[i][j] =sc.nextInt();
                }
            }
            visits = new boolean[N+1][M+1];
            int cnt =0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(!visits[i][j] && map[i][j]==1){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            count.add(cnt);
        }while(N !=0 || M !=0);
        for(int i=0;i<count.size()-1;i++){
            System.out.println(count.get(i));
        }
    }
    public static void dfs(int x, int y){
        visits[x][y] = true;
        int tmp = map[x][y];
        for(int i=0; i<8; i++){
            int new_x = x+dx[i];
            int new_y = y+dy[i];

            if (new_x<0 || new_y<0 || new_x>=N || new_y>=M){
                continue;
            }

            if (!visits[new_x][new_y] && map[new_x][new_y] == tmp){
                dfs(new_x, new_y);
            }
        }
    }
}
