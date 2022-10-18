package Baekjoon;

import java.util.Scanner;
class answer{
    private int[] n1, n2;
    private int big1=0, big2=0;

    void big(int num1, int num2) {
        n1 = new int[3];
        n2 = new int[3];

        for(int i=0; i<n1.length; i++) {
            n1[i] = num1%10;
            num1 = num1 / 10;
            n2[i] = num2%10;
            num2 = num2 / 10;
        }

        for(int i=0; i< n1.length; i++) {
            big1 += n1[i] * (Math.pow(10, n1.length-i-1));
        }

        for(int i=0; i<n2.length; i++) {
            big2 += n2[i] * Math.pow(10, n2.length-i-1);
        }
        if(big1>big2) System.out.println(big1);
        else if(big2>big1) System.out.println(big2);
    }
}

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
