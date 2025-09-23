package T1_임동현.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1546 {

    public static void main(String[] args) {
        //    평균 / 최댓값 * 100

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int len = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
        }

        double avg = (double)sum/list.size();
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) {
                max = list.get(i);
            }
        }

        double newAvg = ((double)avg/max)*100;

        System.out.println(newAvg);
    }

}
