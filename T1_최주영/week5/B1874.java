package T1_최주영.week5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuffer bf = new StringBuffer();
        int number = 1;
        boolean result = true;
        for (int i = 0; i < ints.length; i++) {
            int target = ints[i];
            if (target >= number){
                while (target >= number){
                    stack.push(number);
                    number++;
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int compare = stack.pop();
                if (compare > ints[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if (result){
            System.out.println(bf.toString());
        }
    }
}
