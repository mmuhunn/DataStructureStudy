package T1_권시현.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        long[] pre = new long[n + 1];
        pre[0] = n;
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i-1] + list.get(i-1);   //이거 ㅈ도 모르겠긔
        }
        for (int j = 1; j <= m; j++) {
            int first = sc.nextInt();
            int last = sc.nextInt();
            long sum = pre[last] - pre[first - 1];
            System.out.println(sum);
        }
        sc.close();
    }
}

