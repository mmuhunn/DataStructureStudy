package T1_박소연.week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분분자열의 길이,
그리고 {‘A’, ‘C’, ‘G’, ‘T’} 가 각각 몇번 이상 등장해야 비밀번호로 사용할 수 있는지 순서대로 주어졌을 때
민호가 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하자.
단 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급한다.

입력
첫 번째 줄에 민호가 임의로 만든 DNA 문자열 길이 |S|와 비밀번호로 사용할 부분문자열의 길이 |P| 가 주어진다. (1 ≤ |P| ≤ |S| ≤ 1,000,000)
두번 째 줄에는 민호가 임의로 만든 DNA 문자열이 주어진다.
세번 째 줄에는 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수가 공백을 구분으로 주어진다.
각각의 수는 |S| 보다 작거나 같은 음이 아닌 정수이며 총 합은 |S| 보다 작거나 같음이 보장된다.




 */

public class q12891 {
    static int[] goodPW;
    static int[] currentPW;

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