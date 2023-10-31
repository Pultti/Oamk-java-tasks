
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());

        int start = 1;
        int sum = 0;

        if (start <= number) {
            for (int i = start; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of the numbers: " + sum);

        } else {
            System.out.println("");
        }
    }
}