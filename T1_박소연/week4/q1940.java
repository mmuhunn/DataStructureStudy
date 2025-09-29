package T1_박소연.week4;
/*

갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다.
갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M이 되면 갑옷이 만들어 지게 된다.

N개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다.
그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다.
그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다.
고유한 번호는 100,000보다 작거나 같은 자연수이다.

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            numbers[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int start_i = 0;
        int end_i = N-1;
        int count =0;

        while(start_i<end_i){
            if (numbers[start_i]+numbers[end_i]>M) {
                end_i --;
            } else if(numbers[start_i]+numbers[end_i]<M){
                start_i++;
            } else{
                count++;
                end_i--;
                start_i++;
            }

        }
        System.out.println(count);
        br.close();

    }
}
