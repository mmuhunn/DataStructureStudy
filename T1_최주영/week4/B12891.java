package T1_최주영.week4;

import java.util.Scanner;

public class B12891 {
    public static void main(String[] args) {
        B12891 main = new B12891();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int p = scanner.nextInt();
        String string = scanner.next();
        int[] ints = new int[4];
        for (int i = 0; i < 4; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(main.solution(s, p, string, ints));
    }

    public int solution(int s, int p, String string, int[] ints){
        int pointer1 = 0;
        int pointer2 = pointer1+p-1;
        int aCount = ints[0];
        int cCount = ints[1];
        int gCount = ints[2];
        int tCount = ints[3];
        int count = 0;
        while (pointer2 < s){
            String result = string.substring(pointer1, pointer1+p);
            int aCount2 = 0;
            int cCount2 = 0;
            int gCount2 = 0;
            int tCount2 = 0;
            char[] chars = result.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'A'){
                    aCount2++;
                } else if (chars[i] == 'C') {
                    cCount2++;
                } else if (chars[i] == 'G') {
                    gCount2++;
                }else{
                    tCount2++;
                }
            }
            if (aCount2 >= aCount && cCount2 >= cCount && gCount2 >= gCount && tCount2 >= tCount){
                count++;
                pointer1++;
                pointer2++;
            }else{
                pointer1++;
                pointer2++;
            }
        }
        return count;
    }
}
