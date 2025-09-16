package T1_최주영.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B1940 {
    public int solution(int n, int m, int[] ints){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            arrayList.add(ints[i]);
        }
        Collections.sort(arrayList);
        int pointer1 = 0;
        int pointer2 = ints.length;
        int sum = 0;
        while (sum == ints)


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B1940 main = new B1940();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(main.solution(n,m,ints));
    }
}
