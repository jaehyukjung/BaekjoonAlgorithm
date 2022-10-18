package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1003 {
    public static void main(String argv[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());



        for(int i = 0; i<n;i++){
            int fibo = Integer.parseInt(br.readLine());
            if (fibo ==0){
                System.out.println(1+" " +0);
            }
            else if (fibo == 1){
                System.out.println(0+" " +1);
            }
            else {
                int s0[] = new int[fibo];
                s0[0] = 0;
                s0[1] = 1;
                int s1[] = new int[fibo];
                s1[0] = 1;
                s1[1] = 1;
                if (fibo>=2){
                    for(int j = 2;j<fibo;j++){
                        s0[j]=(s0[j - 2] + s0[j - 1]);
                        s1[j]=(s1[j - 2] + s1[j - 1]);
                    }
                }

                    System.out.println(s0[fibo-1] + " " + s1[fibo-1]);
            }


//            if (fibo ==0){
//                System.out.println(1+" " +0);
//            }
//            else if (fibo == 1){
//                System.out.println(0+" " +1);
//            }
//            else{
//                System.out.println(Fibo0(fibo-2) +" " +Fibo1(fibo-1));
//            }

        }
    }

    static int Fibo1(int n){
        if(n==1 || n==0) return 1;
        else return Fibo1(n-1) + Fibo1(n-2);
    }
    static int Fibo0(int n){
        if(n==1) return 1;
        else if (n==0) return 0;
        else return Fibo1(n-1) + Fibo1(n-2);
    }
}
