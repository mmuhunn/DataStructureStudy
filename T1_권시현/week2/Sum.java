package T1_권시현.week2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0'; // '0' = 48 아스키코드인데 왜 뺴줘야하는지 이해 안됨
        }
        System.out.println(sum);
    }
}

