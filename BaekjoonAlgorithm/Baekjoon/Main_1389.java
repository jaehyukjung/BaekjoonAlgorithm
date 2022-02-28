package Baekjoon;
import java.util.*;
public class Main_1389 {
    static int n, m, k, x;
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        int dist[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
        }
        Arrays.fill(dist,(int)1e9);

    }
}
