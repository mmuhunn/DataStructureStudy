package T1_권시현.week5;

import java.util.Scanner;
import java.util.Stack;

public class StackSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < seq.length; i++) {
            int current = seq[i];
            if (current >= num){
                while (current >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else {
                int number = stack.pop();
                if (number > current) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
