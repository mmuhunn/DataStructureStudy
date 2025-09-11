package T2_오경훈.week2;

import java.sql.Array;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       String s = scanner.next();
       int sum = 0;
       for (int i = 0; i < n ; i++) {
           sum += s.charAt(i) - '0';

       }
        System.out.println(sum);

    }
}
