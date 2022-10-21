package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2210 {
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args)throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String maps[][] =new String[5][5];

        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                maps[i][j] = st.nextToken();
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                dfs(i,j,maps[i][j],maps,1);
            }
        }
        System.out.println(result.size());

    }
    static void dfs(int x, int y, String number, String[][] map, int cnt){
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};

        if(cnt ==6){
            if(!result.contains(number)){
                result.add(number);
            }
            return;
        }
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if((nx>=0 && nx < 5) && (ny >= 0 && ny <5)){
                dfs(nx, ny,number+map[nx][ny],map,cnt+1);
            }
        }
    }
}
