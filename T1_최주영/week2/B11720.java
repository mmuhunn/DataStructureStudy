package T1_최주영.week2;

import java.util.Scanner;

public class B11720 {
    public int solution(int n, String input){
        int sum = 0;
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            sum += (aChar - 48); // achar -'0'
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B11720 main = new B11720();
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println(main.solution(n, input));
    }
}
