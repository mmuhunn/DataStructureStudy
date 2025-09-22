// 백준 1940번 문제: 주몽 실버 4

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 N과 M, 숫자를 입력하세요:"); 

        int N = sc.nextInt();
        
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int start = 0;
        int end = N - 1;

        while (start < end) {


            

            if (arr[start] + arr[end] == M) {
                count++;
                start++;
                end--;

            } else if (arr[start] + arr[end] > M) { //합이 M보다 크면 우측 포인터를 왼쪽으로 한칸 
                end--;

            } else {
                start++; //합이 M보다 작으면 좌측 포인터를 오른쪽으로 한칸
            }
        }
       
        System.out.println(count);
        sc.close();

    }
}