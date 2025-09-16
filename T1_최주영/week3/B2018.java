package T1_최주영.week3;

import java.util.Scanner;

public class B2018 {
    public int solution(int n){
        int count = 1;
        int pointer1 = 1;
        int pointer2 = 1;
        int sum = 1;
        while (pointer2 != n){
            if (sum == n){
                count++;
                pointer2++;
                sum = sum + pointer2;
            }else if (sum < n){
                pointer2++;
                sum = sum + pointer2;
            }else{
                sum = sum - pointer1;
                pointer1++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B2018 main = new B2018();
        int n = scanner.nextInt();
        System.out.println(main.solution(n));
    }
}
