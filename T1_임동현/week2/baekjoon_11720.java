package T1_임동현.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int len = Integer.parseInt(sc.nextLine());
        String num = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += num.charAt(i) - '0';
        }
        
        System.out.println(sum);

    }

}
