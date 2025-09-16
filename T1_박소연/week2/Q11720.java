package T1_박소연.week2;
import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        int sum =0;

        for (int i=0;i<n;i++){
            char c = str.charAt(i);
            int num = c-'0';
            sum+=num;
        }
        System.out.println(sum);
    }
}
