package T1_권시현.week3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        int first = 1;
        int last = 1;
        while (last != n ){
            if (sum < n){
                last += 1;
                sum = sum + last;
            } else if (sum == n){
                count++;
                last += 1;
                sum = sum + last;
            } else {
                sum = sum - first;
                first += 1;
            }
        }
        System.out.println(count);
    }
}
