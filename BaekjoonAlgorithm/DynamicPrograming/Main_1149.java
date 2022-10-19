package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1149 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int RGB[][] =new int[n][3];

        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                RGB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<n;i++){
            RGB[i][0] = Math.min(RGB[i-1][1],RGB[i-1][2])+RGB[i][0];
            RGB[i][1] = Math.min(RGB[i-1][0],RGB[i-1][2])+RGB[i][1];
            RGB[i][2] = Math.min(RGB[i-1][0],RGB[i-1][1])+RGB[i][2];
        }
        Arrays.sort(RGB[n-1]);
        System.out.println(RGB[n-1][0]);
    }
}
