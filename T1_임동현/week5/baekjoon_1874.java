package T1_임동현.week5;


import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1874
public class baekjoon_1874 {

    /*
    첫줄: n
    1 ~ n 까지의 정수가 하나씩

    1 2 3 4 5 6 7 8
    4 3 6 8 7 5 2 1 일 때
    + + + + - - + + - + + - - - - -
    1 2 3 4
    1 2 / 4 3
    1 2 5 6 / 4 3
    1 2 5 / 4 3 6
    1 2 5 7 8 / 4 3 6
    4 3 6 8 7 5 2 1

    1 2 3 4 5
    3 1 2 5 4
    1 2 / 3

    ** 풀이 **
    목표 수열이 n을 찍고 나서
    내림차순으로 내려와야 한다!
    아니면 이미 스택에 들어가버린 숫자를 꺼내오는 연산이 불가능함!

    1. 가능한지 검사
        1) 리스트 들어가서 최댓값 나오는 인덱스 확인
        2) 그 뒤로 내림차순인지 검사

    2. 수열 만들기
        * stack에 넣을 숫자를 s, list의 해당 숫자를 l
        1) l에 대해서
        2) s가 작으면: 같아질 때 까지 push, sb +
        3) 같으면: pop

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // n 입력
        int[] list = new int[n];    // n짜리 리스트 생성

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        boolean canDo = true;

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> stack = new ArrayList<>();
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (num <= list[i]) {
                while (num <= list[i]) {
                    stack.add(num);
                    num++;
                    sb.append("+\n");
                }
                stack.remove(stack.size() - 1);
                sb.append("-\n");
            } else {
                if (stack.isEmpty() || stack.get(stack.size() - 1) != list[i]) {
                    canDo = false;
                    break;
                } else {
                    stack.remove(stack.size() - 1);
                    sb.append("-\n");
                }
            }
        }

        if (canDo) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }

}





