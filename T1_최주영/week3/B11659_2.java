package T1_최주영.week3;
import java.util.Scanner;

public class B11659_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] ints = new int[n1+1];
        for (int i = 1; i <= n1; i++) {
            ints[i] = scanner.nextInt();
        }
        int[] sum = new int[n1+1];
        for (int i = 1; i <= n1 ; i++) {
            sum[i] = sum[i-1] + ints[i];
        }

        for (int i = 0; i < n2; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.println(sum[end] - sum[start-1]);
        }
        scanner.close();
    }
}
