
    import java.util.Scanner;

    public class Login {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String alexUsername = "alex";
            String emmaUsername = "emma";
            String alexPassword = "sunshine";
            String emmaPassword = "haskell";

            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (alexUsername.equals(username) && alexPassword.equals(password)) {
                System.out.println("You have succesfully logged in!");
            } else if (emmaUsername.equals(username) && emmaPassword.equals(password)) {
                System.out.println("You have succesfully logged in!");
            } else {
                System.out.println("Incorrect username or password.");
            }

        }
    }
