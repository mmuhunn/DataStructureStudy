package T1_최주영.week3;

import java.util.Scanner;

public class B2018_2 {
    public int solution(int n){
        int pointer1 = 1;
        int pointer2 = 1;
        int count = 1;
        int sum = 1;
        while (pointer2 != n){
            if (sum == n){
                count++;
                pointer2++;
                sum += pointer2;
            }else if(n < sum){
                sum -= pointer1;
                pointer1++;
            }else{
                pointer2++;
                sum += pointer2;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        B2018_2 main = new B2018_2();
        System.out.println(main.solution(n));
    }
}
