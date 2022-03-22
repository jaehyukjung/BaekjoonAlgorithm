package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1181 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] st_arr = new String[N];

        for(int i=0;i<N;i++){
            st_arr[i] =br.readLine();
        }
        Arrays.sort(st_arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        for(int i=0;i<N;i++){
            if(i<N-1 && st_arr[i].equals(st_arr[i+1])) continue;
            else System.out.println(st_arr[i]);
        }
    }
}
