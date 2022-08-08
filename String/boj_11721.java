package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split("");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < line.length; i++) {
            if(i % 10 == 0 && i != 0)
                sb.append("\n").append(line[i]);
            else
                sb.append(line[i]);
        }

        System.out.println(sb);
    }
}
