package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1764 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String Nli[] = new String[N];
        String Nse[] = new String[M];
        ArrayList<String> NAll =new ArrayList<>();
        for(int i=0;i<N;i++){
            Nli[i] = br.readLine();
        }
        for(int i=0;i<M;i++){
            Nse[i] = br.readLine();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Nli[i].equals(Nse[j])) NAll.add(Nli[i]);
            }
        }

        Collections.sort(NAll);
        System.out.println(NAll.size());
        for(int i=0;i<NAll.size();i++){
            System.out.println(NAll.get(i));
        }

    }
}
