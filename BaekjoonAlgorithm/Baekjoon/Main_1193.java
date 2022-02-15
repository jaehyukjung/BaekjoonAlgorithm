package Baekjoon;

import java.util.Scanner;

public class Main_1193 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n =1;
        while((n+1)*n/2<N){
            n++;
        }
        if(n%2==0){
            if((N-n*(n-1)/2)%n==0)System.out.println(n+"/"+((n-((N-n*(n-1)/2)))%n+1));
            else System.out.println((N-n*(n-1)/2)%n+"/"+((n-((N-n*(n-1)/2)))%n+1));
        }
        else{
            if((N-n*(n-1)/2)%n==0) System.out.println(((n-((N-n*(n-1)/2)))%n+1)+"/"+n);
            else System.out.println(((n-((N-n*(n-1)/2)))%n+1)+"/"+(N-n*(n-1)/2)%n);
        }

    }
}
