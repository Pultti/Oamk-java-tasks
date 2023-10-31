
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int firstNumber = Integer.valueOf(scan.nextLine());

        int secondNumber = Integer.valueOf(scan.nextLine());

        int sum = firstNumber + secondNumber;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
