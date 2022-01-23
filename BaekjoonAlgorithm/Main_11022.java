import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCount = 0;
        caseCount = Integer.parseInt(bf.readLine());

        String[] numbersSet = new String[caseCount];
        int[] numbersSet1 = new int[caseCount];
        int[] numbersSet2 = new int[caseCount];
        int[] sum = new int[caseCount];

        for (int i = 0; i < caseCount; i++) {
            numbersSet[i] = bf.readLine();
        }

        for (int i = 0; i < caseCount; i++) {
            int numberA = Integer.parseInt(numbersSet[i].split(" ")[0]);
            numbersSet1[i]=numberA;
            int numberB = Integer.parseInt(numbersSet[i].split(" ")[1]);
            numbersSet2[i]=numberB;
            sum[i] = numberA + numberB;
        }
        for(int i =0;i < caseCount; i++){
            bw.write("Case #"+String.valueOf(i+1)+":"+String.valueOf(numbersSet1[i])+" + "+String.valueOf(numbersSet2[i])+" = "+String.valueOf(sum[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
