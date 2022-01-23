package Baekjoon;

import java.util.Scanner;

    public class Main_2577 {
        public static void main(String[] argv){
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int multi = A*B*C;
            String str = Integer.toString(multi);
            int ea[]=new int[10];
            for(int i =0;i<10;i++){
                ea[i]=0;
            }

            for(int i =0;i<str.length();i++){
                if(str.charAt(i)=='0') ea[0]++;
                else if(str.charAt(i)=='1') ea[1]++;
                else if(str.charAt(i)=='2') ea[2]++;
                else if(str.charAt(i)=='3') ea[3]++;
                else if(str.charAt(i)=='4') ea[4]++;
                else if(str.charAt(i)=='5') ea[5]++;
                else if(str.charAt(i)=='6') ea[6]++;
                else if(str.charAt(i)=='7') ea[7]++;
                else if(str.charAt(i)=='8') ea[8]++;
                else if(str.charAt(i)=='9') ea[9]++;
            }
            for(int i=0;i<10;i++) {
                System.out.println(ea[i]);
            }
    }
}
