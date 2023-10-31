
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int year = Integer.parseInt(parts[1]);

            // Update longest name
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // Update total years and count
            totalYears += year;
            count++;
        }

        // Calculate average
        double average = (double) totalYears / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

        scanner.close();
    }
}
