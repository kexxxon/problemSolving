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

public class boj_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < N; i++) {
            for(int j = N - 1; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
