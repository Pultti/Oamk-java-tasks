
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int numberThree = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (numberOne+numberTwo+numberThree));

        // Write your program here

    }
}
