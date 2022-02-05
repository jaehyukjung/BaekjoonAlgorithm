package Baekjoon;

import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        char lalp[] =new char[26];
        char salp[] =new char[26];
        int arr[] = new int[26];
        String str = sc.next();


        for(int i=0;i<26;i++){
            lalp[i] = (char)('A'+i);
            salp[i] = (char)('a'+i);
            arr[i] =0;
        }

        for(int i=0;i<str.length();i++){
            for(int j=0;j<26;j++){
                if(str.charAt(i)==lalp[j] || str.charAt(i)==salp[j]) arr[j]+=1;
            }
        }
        int max = 0;
        for(int i=0;i<26;i++){
            if(max<arr[i]) max = arr[i];
        }
        int cnt=0;
        int po=0;
        for(int i=0;i<26;i++){
            if(max==arr[i]) {
                cnt++;
                po=i;
            }
        }
        if(cnt==1) System.out.println(lalp[po]);
        else System.out.println('?');
    }
}
