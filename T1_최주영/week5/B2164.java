package T1_최주영.week5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size()>1){
            queue.poll();
            queue.offer(queue.poll());
            if (queue.size() == 1){
               break;
            }
        }
        System.out.println(queue.peek());
    }
}
