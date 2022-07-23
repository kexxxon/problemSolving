import java.util.Arrays;
import java.util.Scanner;

public class boj_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // Array declaration & size expansion at the same time
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Sort elements with ascending order in Arrays
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}
