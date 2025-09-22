package T1_박소연.week3;
/*
* 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
* 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서,
* 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.
예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다.
* 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
* */
import java.util.Scanner;

//투포인터로 풀면 시간복잡도가 N.
// N이 1000만으로, 다른 알고리즘으로 풀면 1억(1초)가 넘어감.
public class q2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =1; //합이 자기 자신 한 번인 경우
        int start_i = 1;
        int sum =1;
        int end_i =1;

        while(end_i<N){
            if(sum==N){
                count++;
                end_i++;
                sum+=end_i;
            }else if(sum>N){
                sum-=start_i;
                start_i++;
            }else{
                end_i++;
                sum+=end_i;
            }

        }
        System.out.println(count);


    }
}
