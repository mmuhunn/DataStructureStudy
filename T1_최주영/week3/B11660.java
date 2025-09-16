package T1_최주영.week3;

import java.util.Scanner;

public class B11660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[][] ints = new int[n1+1][n1+1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 ; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }

        int[][] sum = new int[n1+1][n1+1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + ints[i][j];
            }
        }


        for (int i = 0; i < n2; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            System.out.println(sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1]);
        }


    }
}
