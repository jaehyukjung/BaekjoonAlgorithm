import java.util.ArrayList;
import java.util.Scanner;

public class Main1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =0;
        int y =1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(x+y !=0){
            x = sc.nextInt();
            y = sc.nextInt();
            arr.add(x+y);
        }
        for(int i=0;i<arr.size()-1;i++){
            System.out.println(arr.get(i));
        }
    }
}
