import java.util.Scanner;


public class BOJ_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        int M = sc.nextInt(); // 구간의 개수

        int prefixSum[] = new int[N+1]; //구간 합 어레이 초기화

        


        for (int i = 1; i <= N; i++) { //구간 합 어레이 생성
            prefixSum[i] = sc.nextInt() + prefixSum[i-1];
            
        }
        
        
        for (int i = 1; i <= M; i++) {
            int startNum = sc.nextInt();
            int endNum = sc.nextInt();
            
            int sum = prefixSum[endNum] - prefixSum[startNum-1];
            System.out.println(sum);
            
        }
        
        

    sc.close();
    }


}
