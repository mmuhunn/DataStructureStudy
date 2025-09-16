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
            sum += s.charAt(i) - '0'; //'0' = 48 아스키코드인데 문자를 숫자로 바꿀 때 아스키코드로 바뀌기 때문에 빼주는거임.
        }
        System.out.println(sum);
    }
}
