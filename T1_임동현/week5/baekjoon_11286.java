package T1_임동현.week5;

import java.util.PriorityQueue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11286
public class baekjoon_11286 {

    /*
    연산의 개수 N
    정수 x
    x == 0: 절댓값이 가장 작은 값을 출력 및 제거
    x != 0: 배열에 x 추가

    ** 절댓값 동일: 가장 작은 수 출력
    ** 배열에 값 없으면: 0 출력

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs - second_abs == 0) {
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs;
        });

        for (int i = 0; i < n; i++) {
            int request = sc.nextInt();

            if (request == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }

    }


}
