import java.util.Scanner;

public class boj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input 9 times
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();

        int count = 0, max = 0, index = 0;

        // count++ each time when circulate the arr by value
        for(int value : arr) {
            count++;

            // if the value is greater than max
            if(value > max) {
                // assign the largest value to max
                max = value;
                // assign the count to index
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}