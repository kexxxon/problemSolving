package controlFlowStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());

        if(N > 0) System.out.println(N + M);
        else if(N < 0) System.out.println(N * -1);

//        System.out.println(Math.abs(N - M));
    }
}
