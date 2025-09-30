package T1_최주영.week5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B1874_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < ints.length; i++) {
            if (num <= ints[i]){
                while (ints[i] >= num){
                    stack.push(num);
                    num++;
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            }else {
                int n2 = stack.pop();
                if (n2 > ints[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    stringBuffer.append("-\n");
                }
            }

        }
        if (result){
            System.out.println(stringBuffer.toString());
        }

    }
}
