
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            // Stop if input is empty
            if (input.isEmpty()) {
                break;
            }
            
            // Split the string by whitespace
            String[] parts = input.split(" ");
            
            // Print each part on a new line
            for (String part : parts) {
                System.out.println(part);
            }
        }
        
        scanner.close();
    }
}
