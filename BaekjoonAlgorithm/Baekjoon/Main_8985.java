package Baekjoon;

import java.util.Scanner;

public class Main_8985 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str[]= new String[N];

        for(int i=0;i<N;i++){
            str[i]=sc.next();
        }

        int cnt=0;
        int point=0;
        for(int i=0;i<N;i++){
            if(str[i].charAt(0)=='O'){
                cnt =1;
                point=1;
                for(int j=1;j<str[i].length();j++){
                    if(str[i].charAt(j-1)==str[i].charAt(j) && str[i].charAt(j-1)=='O'){
                        cnt=cnt+1;
                        point=point +cnt;
                    }
                    else if(str[i].charAt(j)=='O'){
                        cnt =1;
                        point = point+cnt;
                    }
                    else if(str[i].charAt(j)=='X'){
                        cnt=0;
                    }
                }
            }
            if(str[i].charAt(0)=='X'){
                for(int j=1;j<str[i].length();j++){
                    if(str[i].charAt(j-1)==str[i].charAt(j) && str[i].charAt(j-1)=='O'){
                        cnt=cnt+1;
                        point=point +cnt;
                    }
                    else if(str[i].charAt(j)=='O'){
                        cnt =1;
                        point = point+cnt;
                    }
                    else if(str[i].charAt(j)=='X'){
                        cnt=0;
                    }
                }
            }
            System.out.println(point);
            point =0;
            cnt = 0;
        }
    }
}
