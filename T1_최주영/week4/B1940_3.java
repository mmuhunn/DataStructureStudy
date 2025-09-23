package T1_최주영.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B1940_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        int pointer1 = 1;
        int pointer2 = n1-1;
        int count = 0;
        while(pointer1 < pointer2){
            if (arrayList.get(pointer1) + arrayList.get(pointer2) == n2){
                count++;
                pointer1++;
                pointer2--;
            } else if (arrayList.get(pointer1) + arrayList.get(pointer2) < n2) {
                pointer1++;
            }else{
                pointer2--;
            }
        }
        System.out.println(count);
    }
}
