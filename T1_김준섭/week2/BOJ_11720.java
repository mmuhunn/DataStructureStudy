import java.util.Scanner;

public class BOJ_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        int N = sc.nextInt();                   // 정수 N 입력
        String sNum = sc.next();                // N개의 숫자가 붙어있는 문자열 입력
        
        char[] cNum = sNum.toCharArray();       // 문자열을 문자 배열로 변환
        int sum = 0;                            // 합을 저장할 변수 초기화
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';          // 문자 숫자를 정수로 변환하여 합산
        }
        
        System.out.println(sum);
    }

}
