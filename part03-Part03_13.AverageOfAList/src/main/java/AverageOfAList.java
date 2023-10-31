
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            number.add(input);
            sum = sum + input;
        }
        double average = 1.0 * sum / number.size();

            System.out.println("average: "+ average);
        }
        }
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it. 
    

