package Baekjoon;

import java.util.*;

public class Main_tu {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

//		System.out.print("개수, 값 입력>");
//		int num = sc.nextInt();
//		int arr[]=new int[num];
//		for(int i=0;i<num;i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int count =0;
//		for (int i=0;i<num-1;i++) {
//			if(arr[i]<arr[i+1]) {
//				count = count+1;
//			}
//		}
//		if(count>1) {
//			System.out.println("0");
//		}
//		else {
//			System.out.println("1");
//		}

		int[] arr = new int[5];
		int[] temp = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] =i+1;
		}
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr = temp;
		arr[5]=7;
		System.out.println(arr.length);
		sc.close();
    }
}
