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
public class q2018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        //4472*4473/2 >10000000
        int[] sums = new int[4480];
        for (int i=1;i<4475;i++) {
            if(i>1)sums[i]= i+sums[i-1];
            else sums[i]=i;
        }
        int count =0;
        for(int j=0;j<=((N+1)/2);j++){
            for(int k=0;k<j;k++){
                if(k==0){
                    if(N==sums[j]){
                        count++;
                    }
                }else{
                    if(N==(sums[j]-sums[k])){
                        count++;
                    }
                }
            }
        }
        System.out.println(count+1);
    }
}
