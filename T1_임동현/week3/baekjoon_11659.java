package T1_임동현.week3;


import java.util.Scanner;

// https://www.acmicpc.net/problem/11659
public class baekjoon_11659 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] list = new int[n + 1];
        int[] prefix = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = sc.nextInt();
            prefix[i] = prefix[i - 1] + list[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();

            sb.append(prefix[endIdx] - prefix[startIdx - 1]).append("\n");
        }

        System.out.println(sb.toString());

    }
}
