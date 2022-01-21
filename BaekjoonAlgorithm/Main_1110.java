import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int N1=N;
        int cnt=0;

        do{
            num = (N1%10)*10+((N1/10)+N1%10)%10;
            cnt++;
            N1=num;
        }while (N !=num);

        System.out.println(cnt);
    }

}