package T1_임동현.week3;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2018
public class baekjoon_2018 {
// 연속된 숫자의 합으로 나타내는 방법?
// 2개: 나머지 1
// 3개: 나눠떨어짐
// 4개: 나머지 2 (n-1 n n+1 n+2)
// 5개: 나눠떨어짐
// 6개: 나머지 3 (n-2 n-1 n n+1 n+2 n+3)
// 7개: 나눠떨어짐
// ...
// 정수 N에 대해
// 홀수 n개의 합: N % n = 0
// 짝수 n개의 합: N % n = n/2
// 최대 몇 개?
// 1 2 3 4  5  6  7  8  9  10 11
// 1 3 6 10 15 21 28 36 45 55 66 ...
// 24 -> 7 8 9
// 1. 구간 찾기
// 2. 구간 안에서 해당되는 n 찾기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n = 0;    // 최대 n 개 까지 더할 수 있음
        int range = 0;
        for (int i = 1; i < num; i++) {
            range += i;
            n++;
            if (range >= num) {
                break;
            }
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0){
                if(num % i == i / 2){
                    cnt++;
                }
            }else{
                if(num % i == 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt + 1);
    }
}
