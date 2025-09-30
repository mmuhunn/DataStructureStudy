package T1_권시현.week2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

