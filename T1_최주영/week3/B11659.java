package T1_최주영.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n1 = Integer.parseInt(stringTokenizer.nextToken());
        int n2 = Integer.parseInt(stringTokenizer.nextToken());
        long[] longs = new long[n1 + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= n1; i++) {
            longs[i] = longs[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < n2; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n3 = Integer.parseInt(stringTokenizer.nextToken());
            int n4 = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(longs[n4]-longs[n3-1]);
        }
        
    }
}
