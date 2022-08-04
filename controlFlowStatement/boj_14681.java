package controlFlowStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        if(X > 0 && Y > 0) System.out.println(1);
        else if(X < 0 && Y > 0) System.out.println(2);
        else if(X < 0 && Y < 0) System.out.println(3);
        else System.out.println(4);
    }
}