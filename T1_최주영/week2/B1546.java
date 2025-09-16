package T1_최주영.week2;

import java.util.Scanner;

public class B1546 {
    public double solution(int n, int[] scores){
        double sum = 0;
        double count = 0;
        int max = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score >= max){
                max = score;
            }
        }

        for (int score : scores) {
            sum += ((double) score /max*100);
            count++;
        }
        double average = sum/count;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B1546 main = new B1546();
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.println(main.solution(n, scores));
    }
}
