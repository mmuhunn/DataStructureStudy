package T1_권시현.week2;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        double sum = 0;
        int max = 0;
        for (int i = 1; i <= n; i++){
            int num = sc.nextInt();
            if (max < num){
                max = num;
            }
            sum += num;
        }
        double total = sum/max*100;
        System.out.println(total / n);

    }
}
