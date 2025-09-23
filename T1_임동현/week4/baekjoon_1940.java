package T1_임동현.week4;


import java.util.Scanner;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1940
public class baekjoon_1940 {
    /*
    갑옷 재료는 고유한 번호
    두 개의 재료로 만듦
    번호를 합쳐 M이 되면 만들어짐
    최대 몇 개의 갑옷을 만들 수 있나?
    N개의 재료와
    숫자 M이 주어짐
    재료 한 번 쓰면 없어짐!!!
    고유한 번호이기 때문에 중복 값 없음!!!
    1 2 3 4 5 7
    < M: startIdx++
    > M: endIdx--
    = M: startIdx++, endIdx--, cnt++

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];

        // O(N)
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int startIdx = 0;
        int endIdx = N - 1;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (list[startIdx] + list[endIdx] == M) {
                cnt++;
                startIdx++;
                endIdx--;
            }
            if (list[startIdx] + list[endIdx] < M) {
                startIdx++;
            }
            if (list[startIdx] + list[endIdx] > M) {
                endIdx--;
            }
            if(startIdx >= endIdx) break;
        }

        System.out.println(cnt);
    }

}
