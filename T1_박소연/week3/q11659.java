package T1_박소연.week3;
import java.util.Scanner;
//수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
//첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
// 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
// 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
public class q11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] sums = new int[N];
        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            if(i==0) sums[i]=num;
            else sums[i]= (sums[i-1]+num);
        }

        for(int j=0; j<M; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==1) System.out.println(sums[b-1]);
            else System.out.println(sums[b-1]-sums[a-2]);
        }
        sc.close();

    }

}
