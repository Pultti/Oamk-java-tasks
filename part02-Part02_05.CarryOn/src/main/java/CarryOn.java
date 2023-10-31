
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String pass;
            System.out.println("Shall we carry on?");
            pass = scanner.nextLine();

            if ("no".equals(pass)) {
                break;
            }
        }

    }
}
