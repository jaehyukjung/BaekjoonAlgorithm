package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1932 {
    public static void main(String[] argv)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<i+1;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =1;i<n;i++){
            for(int j = 0;j<i+1;j++){
                if(j == 0) arr[i][j] = arr[i-1][j] + arr[i][j];
                else if(j ==i)  arr[i][j] = arr[i-1][j-1] + arr[i][j];
                else arr[i][j] = Math.max(arr[i-1][j-1],arr[i-1][j]) + arr[i][j];
            }
        }
        Arrays.sort(arr[n-1]);
        System.out.println(arr[n-1][n-1]);
    }
}
