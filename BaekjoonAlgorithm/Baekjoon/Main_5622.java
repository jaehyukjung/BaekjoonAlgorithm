package Baekjoon;

import java.util.Scanner;

public class Main_5622 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[26];
        for(int i=0;i<26;i++){
            ch[i] = (char)(i+'A');
        }
        int time=0;
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch[0] && str.charAt(i)==ch[1] && str.charAt(i)==ch[2]) time = time+3;
            else if(str.charAt(i)==ch[3] && str.charAt(i)==ch[4] && str.charAt(i)==ch[5]) time = time+4;
            else if(str.charAt(i)==ch[6] && str.charAt(i)==ch[7] && str.charAt(i)==ch[8]) time = time+5;
            else if(str.charAt(i)==ch[9] && str.charAt(i)==ch[10] && str.charAt(i)==ch[11]) time = time+6;
            else if(str.charAt(i)==ch[12] && str.charAt(i)==ch[13] && str.charAt(i)==ch[14]) time = time+7;
            else if(str.charAt(i)==ch[15] && str.charAt(i)==ch[16] && str.charAt(i)==ch[17] &&str.charAt(i)==ch[18]) time = time+8;
            else if( str.charAt(i)==ch[19] && str.charAt(i)==ch[20] && str.charAt(i)==ch[21]) time = time+9;
            else time = time+11;
        }
        System.out.println(time);
    }
}
