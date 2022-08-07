package star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
     *
     **
     ***
     ****
     *****
 */

public class boj_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
