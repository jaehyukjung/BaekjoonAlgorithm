package DynamicPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int arr3[] = new int[42];
        ArrayList<Integer> arr4 = new ArrayList<>();

        for(int i =0;i<42;i++){
            arr3[i]=i;
        }
        for(int i =0;i<10;i++){
            arr1[i] = sc.nextInt();
            arr1[i] = arr1[i]%42;
        }
        int cnt=0;

        Arrays.sort(arr1);
        int num = arr1[0];
        arr4.add(num);
        for(int i=1;i<10;i++){
            if(num !=arr1[i]) {
                arr4.add(num);
                num = arr1[i];
            }
        }
        System.out.println(arr4.size());
    }
}

