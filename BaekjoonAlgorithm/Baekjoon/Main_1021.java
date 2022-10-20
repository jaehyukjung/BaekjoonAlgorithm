package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main_1021 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count =0; int my_point = 0;

        int arr[] = new int[N];
        int w_arr[] = new int[M];

        for(int i= 0;i<N;i++){
            arr[i] = i+1;
        }

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<M;i++){
            w_arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0;i<M;i++){
            int x = w_arr[i];
            if (((x-1) > my_point) && ((x-1) - my_point >= arr.length - (x-1) + my_point)){
                while(my_point != (x-1)){
                    if (my_point-1 == -1){ my_point = arr.length-1;}
                    else{ my_point -= 1;}
                    if (arr[my_point] != -1){ count ++;}
                }
                count -=1;
            }
            else if (( (x-1) > my_point) && ((x-1) - my_point < arr.length -  (x-1) + my_point)){
                while(my_point != (x-1)){
                    if (arr[++my_point] != -1){count ++;}
                }
            }
            else if (((x-1) < my_point) && (my_point -  (x-1) >= arr.length +  (x-1) - my_point)){
                while(my_point != (x-1)){
                    if (my_point+1 == arr.length){ my_point = 0;}
                    else{ my_point += 1;}

                    if (arr[my_point] != -1){ count ++;}
                }
                count -=1;
            }
            else if (((x-1) < my_point) && (my_point -  (x-1) < arr.length +  (x-1) - my_point)){
                while(my_point != (x-1)) {
                    if (arr[--my_point] != -1) {
                        count++;
                    }
                }
            }

            arr[my_point] = -1;
            if (my_point == arr.length-1){
                my_point = 0;
            }
            else{ my_point += 1;}
        }
        System.out.println(count);
    }
}
