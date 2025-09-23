package T1_최주영.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1940_2 {
    public int solution(int n, int m, int[] ints){
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(ints[i]);
        }
        Collections.sort(integers);
        int pointer1 = 0;
        int pointer2 = n-1;
        int count = 0;
        while (pointer1 < pointer2){
            int sum = integers.get(pointer1) + integers.get(pointer2);
            if (sum == m){
                count++;
                pointer1++;
                pointer2--;
            }else if(sum < m){
                pointer1++;
            }else{
                pointer2--;
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        B1940_2 main = new B1940_2();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int[] ints = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(main.solution(n, m, ints));
    }
}
