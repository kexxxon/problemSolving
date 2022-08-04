package controlFlowStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = br.readLine().split(" ");
//            int A = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            sb.append(A + B + "\n");
        }
        System.out.println(sb);
    }
}
