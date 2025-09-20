package T1_권시현.week2;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k > max) {
                max = k;
            }
        }
        double mean = (double) total / n;
        System.out.println(mean);

    }
}
