package T1_임동현.week3;

import java.util.Scanner;

public class two_pointer_2018 {
/*
startIdx
endIdx
sum
cnt

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

startIdx ~ endIdx 총합을 num과 비교
작으면: endIdx++, sum + endIdx
크면: startIdx++, sum - startIdx
같으면: endIdx++, sum + endIdx, cnt++
 */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int startIdx = 1, endIdx = 1, sum = 1, cnt = 0;

        while (startIdx <= num) {
            if(sum < num){
                endIdx++;
                sum += endIdx;
            }else if(sum > num){
                sum -= startIdx;
                startIdx++;
            }else{
                cnt++;
                endIdx++;
                sum += endIdx;
            }
        }

        System.out.println(cnt);

    }
}
