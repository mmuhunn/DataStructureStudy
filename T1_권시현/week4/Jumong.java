package T1_권시현.week4;

import java.util.Scanner;

public class Jumong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        int m = input.nextInt();
        int count = 0;
        int[] newArray = new int[n];
        for (int i = 1; i <= n; i++){
            int k = input.nextInt();
            newArray[i-1] = k;
        }
        for (int j = 0; j < n; j++){
            for (int k = n-1; k>j; k--){
                if (newArray[j]+newArray[k] == m){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
