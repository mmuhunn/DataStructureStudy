package T1_박소연.week2;
import java.util.Scanner;

public class Q1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i=0;i<n;i++) {
            scores[i] = sc.nextInt();
        }

        int max = -1;

        for(int score:scores) {
            if(score>max) {
                max =score;
            }
        }

        double sum =0;
        for(int score: scores) {
            double newScore = 1.0*score/max*100;
            sum +=newScore;
        }
        System.out.println(sum/n);

    }

}