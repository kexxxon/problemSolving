import java.util.Scanner;

public class boj_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sb.append((int)(Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    /*
        N: a number of disks
        start: departure
        temp: a place for move to
        to: destination
     */

    public static void Hanoi(int N, int start, int temp, int to) {
        // only one disk to move
        if(N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // if A move to C
        // Step 1. move N-1 from A to B
        // (= move N-1 disk at the start point to the temp point)
        Hanoi(N - 1, start, to, temp);

        // Step 2. move one A to C
        // (= move N disk at the start point to the to point)
        sb.append(start + " " + to + "\n");

        // Step 3. move B to C for N-1
        // (= move N-1 disk at the temp point to the to point)
        Hanoi(N - 1, temp, start, to);
    }
}
