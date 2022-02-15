package Baekjoon;

import java.util.Scanner;

public class Main_1316 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        char arr[]=new char[26];
        int N = sc.nextInt();
        String[] st = new String[N];
        for(int i=0;i<N;i++){
            st[i] = sc.nextLine();
        }
        for(int i=0;i<26;i++){
            arr[i]=(char)('a'+i);
        }
        int ans=0;
        for(int k=0;k<N;k++){
            int cnt=1;
            for(int i=1;i<st[k].length();i++){
                for(int j=0;j<26;j++){
                    if(st[k].charAt(0)==arr[j]) arr[j]='0';
                    if(st[k].charAt(i)==arr[j] || st[k].charAt(i)==st[k].charAt(i-1)){
                        arr[j]='0';
                        cnt++;
                    }
                }
            }
            if(cnt==st[k].length()) ans++;
        }
        System.out.println(ans);



    }

}
class GroupWord{
    private String st;
    char arr[]=new char[26];

    int GW(String s){
        this.st = s;
        int cnt=1;
        for(int i=0;i<26;i++){
            arr[i]=(char)('a'+i);
        }
        for(int i=1;i<st.length();i++){
            for(int j=0;j<26;j++){
                if(st.charAt(0)==arr[j]) arr[j]='0';
                if(st.charAt(i)==arr[j] || st.charAt(i)==st.charAt(i-1)){
                    arr[j]='0';
                    cnt++;
                }
            }
        }
        if(cnt==st.length()) return 1;
        else return 0;
    }
}