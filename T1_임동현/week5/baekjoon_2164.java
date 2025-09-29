package T1_임동현.week5;

import java.util.ArrayDeque;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2164
public class baekjoon_2164 {

    /*
    (위) 1 2 3 ... N (아래)
    버리고 옮기고
    ex) 1 2 3 4
    1) 2 3 4    / 1 버림
    2) 3 4 2    / 2 아래로
    3) 4 2      / 3 버림
    4) 2 4      / 4 아래로
    5) 4        / 2 버림

    cnt = 1
    cnt 홀수면 > 버림
        짝수면 > 아래로

    ArrayList.remove(0): shift 연산때문에 매 번 O(n)!!!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            que.add(i + 1);
        }

        while (que.size() > 1) {
            que.pollFirst();
            que.add(que.pollFirst());
        }

        System.out.println(que.getFirst());
    }
}
