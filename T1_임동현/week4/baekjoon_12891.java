package T1_임동현.week4;


import java.util.Scanner;

// https://www.acmicpc.net/problem/12891
public class baekjoon_12891 {

    /*
    A C G T 순서
    문자열 범위 안에 갯수 포함

    reqA / reqC / reqG / reqT
    cntA / cntC / cntG / cntT

    9 8
    CCTGGATTG
    2 0 1 1
    CCTGGATT / CTGGATTG

    4 2
    GATA
    1 0 0 1
    GA / AT / TA

    6 2
    AAAAAA

    S - P + 1 회 반복

    // if문으로
    갯수를 이미 세었다면
    가장 앞의 문자열 -1
    새로 들어오는 문자열 +1 하면 되는거 아님??
    가장 앞/뒤의 문자열을 변수로 저장해서 비교?
    frontChar = list[0]
    endChar = list[P-1]

    해야 할 것
    1. 입력된 문자열 숫자 세기: O(N)
    2.

    처음에 한 번만 숫자 세고
    투포인터 개념으로 이동할 때 마다
    cnt-- 하는 알파벳
    cnt++ 하는 알파벳

    6 3 일 때
    0 1 2 3 4 5 6
    A T C G A T G

    ATC:
    delChar = A
    addChar = G

    TCG:
    delChar = T
    addChar = A

    ...


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        sc.nextLine();

        String dna = sc.nextLine();
        String[] dnaArr = dna.split("");

        int reqA = sc.nextInt();
        int reqC = sc.nextInt();
        int reqG = sc.nextInt();
        int reqT = sc.nextInt();

        int cntA = 0;
        int cntC = 0;
        int cntG = 0;
        int cntT = 0;

        int cnt = 0;

        // O(N)
        // 초기값
        for (int i = 0; i < P; i++) {
            switch (dnaArr[i]) {
                case "A":
                    cntA++;
                    break;
                case "C":
                    cntC++;
                    break;
                case "G":
                    cntG++;
                    break;
                case "T":
                    cntT++;
                    break;
            }
        }

        if (cntA >= reqA && cntC >= reqC && cntG >= reqG && cntT >= reqT) {
            cnt++;
        }

        // O(N)
        int firstIdx = 0;
        int lastIdx = P;

        while (lastIdx < S) {
            String delChar = dnaArr[firstIdx];
            String addChar = dnaArr[lastIdx];

            switch (delChar) {
                case "A":
                    cntA--;
                    break;
                case "C":
                    cntC--;
                    break;
                case "G":
                    cntG--;
                    break;
                case "T":
                    cntT--;
                    break;
            }

            switch (addChar) {
                case "A":
                    cntA++;
                    break;
                case "C":
                    cntC++;
                    break;
                case "G":
                    cntG++;
                    break;
                case "T":
                    cntT++;
                    break;
            }

            if (cntA >= reqA && cntC >= reqC && cntG >= reqG && cntT >= reqT) {
                cnt++;
            }

            firstIdx++;
            lastIdx++;
        }

        System.out.println(cnt);

    }
}
