package T1_권시현.week2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        String k = sc.nextLine();
        for (int i = 1; i <= n; i++) {

            sum = sum + k.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
