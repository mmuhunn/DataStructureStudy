package T1_임동현.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1111_ex {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        long[] a = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            a[i] = Long.parseLong(st.nextToken());
        }

        // N == 1: 정보 부족
        if (N == 1) {
            System.out.println("A");
            return;
        }

        // N == 2: 두 수가 같으면 다음도 그 수, 다르면 정보 부족
        if (N == 2) {
            if (a[0] == a[1]) System.out.println(a[0]);
            else System.out.println("A");
            return;
        }

        // N >= 3
        // a[i+1] = A * a[i] + B 형태 가정
        // A, B를 정수로 결정 가능하면 검증 후 다음 수 출력, 아니면 B
        if (a[0] == a[1]) {
            // 처음 두 수가 같은데 다음이 다르면 불가능
            for (int i = 1; i < N; i++) {
                if (a[i] != a[0]) {
                    System.out.println("B");
                    return;
                }
            }
            // 전부 같은 상수 수열
            System.out.println(a[0]);
            return;
        }

        long denom = a[1] - a[0];
        long numer = a[2] - a[1];

        // A는 정수여야 함
        if (numer % denom != 0) {
            System.out.println("B");
            return;
        }

        long A = numer / denom;
        long B = a[1] - A * a[0];

        // 전체 검증
        for (int i = 0; i < N - 1; i++) {
            if (a[i + 1] != A * a[i] + B) {
                System.out.println("B");
                return;
            }
        }

        // 다음 항 출력
        System.out.println(A * a[N - 1] + B);
    }
}
