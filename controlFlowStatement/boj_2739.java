package controlFlowStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//         br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 9; i++) {
            int sum = N * i;
            sb.append(String.format("%d * %d = %d\n", N, i, sum));
//            System.out.printf("%d * %d = %d\n", N, i, sum);
        }
        System.out.println(sb);

//        for(int i = 1; i <= 9; i++) {
//            int result = N * i;
//            System.out.println(N + " * " + i + " = " + result);
//        }
    }
}
