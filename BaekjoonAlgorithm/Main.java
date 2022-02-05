import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char alp[] =new char[26];
        int arr[] =new int[26];

        for(int i=0;i<26;i++){
            alp[i] = (char)('a'+i);
            arr[i] = -1;
        }

        for(int i=0;i<str.length();i++){
            for(int j=0;j<26;j++){
                if(str.charAt(i)==alp[j] && arr[j]==-1){
                    arr[j] = i;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.print(arr[i]+" ");
        }

    }

}