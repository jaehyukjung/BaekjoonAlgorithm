package Baekjoon;

import java.util.Scanner;

public class Main_2908 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int arr1[] = new int[3];
        int arr2[] = new int[3];

        arr1[2] = N1/100;
        arr1[1] = N1/10-arr1[2]*10;
        arr1[0] = N1%10;
        arr2[2] = N2/100;
        arr2[1] = N2/10-arr2[2]*10;
        arr2[0] = N2%10;
        N1 = arr1[0]*100+arr1[1]*10+arr1[2];
        N2 = arr2[0]*100+arr2[1]*10+arr2[2];
        if(N1>N2) System.out.println(N1);
        else System.out.println(N2);
    }
}
