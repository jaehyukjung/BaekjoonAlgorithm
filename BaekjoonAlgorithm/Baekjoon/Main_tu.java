package Baekjoon;

import java.util.*;

public class Main_tu {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);


		String name = "정재혁";
		System.out.print("출력횟수를 입력하세요: ");
		int num = sc.nextInt();

		for(int i = 0;i<num;i++) {
			System.out.print(name+" ");
			if((i+1)%5==0) {
				System.out.println(" ");
			}
		}

		System.out.println("===menu===");
		System.out.println("1. 좌표입력");
		System.out.println("2. 사각형 영역안에 있는가?");
		System.out.println("3. 메뉴");
		System.out.println("4. 종료");

		int n = 0;
		int x =0; int y =0;
		while(n!=4) {
			System.out.print("메뉴를 선택하세요: ");
			n = sc.nextInt();
			switch(n){
			case 1:
				System.out.println("1. 좌표입력");
				System.out.print("x좌표: ");
				x= sc.nextInt();
				System.out.print("y좌표: ");
				y = sc.nextInt();
				break;
			case 2:
				if(50<=x && x<=100 && 50<y && y<=100) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				break;
			case 3:
				System.out.println("===menu===");
				System.out.println("1. 좌표입력");
				System.out.println("2. 사각형 영역안에 있는가?");
				System.out.println("3. 메뉴");
				System.out.println("4. 종료");
				break;
			case 4:
				System.out.println("종료");
			}
		}



        int arr[] = new int[40];
        int i =0;
        System.out.println("2자리 수 정수를 입력하세요: ");
        do {
            arr[i]=sc.nextInt();
            i++;
        }while(arr[i-1]!=0);

        i=i-1;
        for(int j =0;j<i;j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
        int max =0;
        int maxj=0;
        for(int j=0;j<i;j++) {
            if(max<arr[j]) {
                max = arr[j];
                maxj =j;
            }
        }
        int temp=0;

        temp = arr[i-1];
        arr[i-1] = arr[maxj];
        arr[maxj]= temp;

        for(int j=0;j<i;j++) {
            System.out.print(arr[j]+" ");
        }



        sc.close();

    }
}
