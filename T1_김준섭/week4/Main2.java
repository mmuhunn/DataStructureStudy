//백준 12891번
import java.util.Scanner;


public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println(" 입력:");


        int S = sc.nextInt();
        int P = sc.nextInt();        
        String str = sc.next();

        int[] checkarr = new int[4];
        for (int i = 0; i < 4; i++) {
            checkarr[i] = sc.nextInt();
        }

        char[] arr = str.toCharArray();

        System.out.println(arr);

    }

}
