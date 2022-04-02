package 튜터링;

import java.io.IOException;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("32 이상의 정수를 입력하세요 > ");
        int n = sc.nextInt(); //아스키코드 마지막 번호
        for(int i=32; i<=n; i++) {
            System.out.print((char)i + " ");
            if((i-31)%16==0) {
                System.out.println();
            }
        }


        sc.close();
    }
}
