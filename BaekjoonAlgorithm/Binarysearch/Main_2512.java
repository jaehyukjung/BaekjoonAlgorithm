package Binarysearch;

import java.util.Arrays;
import java.util.Scanner;

class binsearch1{
    public static int binsearch1(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        int mid =(start+end)/2;
        while(end-start>= 0){
            if(arr[mid]== target){
                return arr[mid];
            }
            else if(arr[mid]<= target){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
            mid= (end+start)/2;
        }
        return arr[mid];
    }
}
public class Main_2512 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =sc.nextInt();
        }
        int M = sc.nextInt();

        Arrays.sort(arr);

    }
}
