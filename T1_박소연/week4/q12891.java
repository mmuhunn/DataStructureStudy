package T1_박소연.week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q12891 {
    static int[] goodPW;
    static int[] currentPW;
    static int validCount = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = 0;

        goodPW = new int[4];
        currentPW = new int[4];

        char[] DNAs = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());

        // goodPW 배열 초기화 및 validCount 설정
        for (int i = 0; i < 4; i++) {
            goodPW[i] = Integer.parseInt(st.nextToken());
        }

        // 초기 윈도우 설정 (첫 번째 부분 문자열)
        for (int i = 0; i < P; i++) {
            add(DNAs[i]);
        }

        // 첫 번째 윈도우 확인
        if (checkValidity()) {
            count++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            add(DNAs[i]);        // 새로운 문자 추가
            remove(DNAs[i - P]); // 이전 문자 제거

            if (checkValidity()) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    // 문자열에 문자를 추가하는 함수
    private static void add(char c) {
        switch (c) {
            case 'A':
                currentPW[0]++;
                break;
            case 'C':
                currentPW[1]++;
                break;
            case 'G':
                currentPW[2]++;
                break;
            case 'T':
                currentPW[3]++;
                break;
        }
    }

    // 문자열에서 문자를 제거하는 함수
    private static void remove(char c) {
        switch (c) {
            case 'A':
                currentPW[0]--;
                break;
            case 'C':
                currentPW[1]--;
                break;
            case 'G':
                currentPW[2]--;
                break;
            case 'T':
                currentPW[3]--;
                break;
        }
    }

    // 현재 윈도우가 유효한지 확인하는 함수
    private static boolean checkValidity() {
        for (int i = 0; i < 4; i++) {
            if (currentPW[i] < goodPW[i]) {
                return false;
            }
        }
        return true;
    }
}