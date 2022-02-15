import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int meet[][] =new int[N][2];
        for(int i=0;i<N;i++){
            meet[i][0] = sc.nextInt();
            meet[i][1] = sc.nextInt();
        }
        Arrays.sort(meet, new Comparator<int[]>() {
            public int compare(int[] s1, int[] s2) {
                return s1[0] - s2[0];
            }
        });
        Arrays.sort(meet, new Comparator<int[]>() {
            public int compare(int[] s1, int[] s2) {
                return s1[1] - s2[1];
            }
        });

        int count =0;
        int endtime = 0;


        for(int i=0;i<N;i++){
            if(endtime<=meet[i][0]){
                endtime = meet[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}
