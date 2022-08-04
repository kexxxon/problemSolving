package controlFlowStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* A + B - 4 */

public class boj_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declare String type str variable
        String str;

        // eof 값을 집어넣으면 null이 되고 while 종료  => 인텔리제이에서 eof 안됨
        while((str = br.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(str);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A + B);
        }
    }
}
