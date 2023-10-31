
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to:");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from:");
        int start = Integer.valueOf(scanner.nextLine());

        if (start <= number) {
            for (int i = start; i <= number; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("");
        }
    }
}
