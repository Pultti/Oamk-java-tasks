public class Division {
    public static void main(String[] args) {
        int number1 = 3; 
        int number2 = 5; 

        division(number1, number2);
    }

    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Cannot divide by zero!");
            return;
        }
        double result = (double) numerator / (double) denominator;
        System.out.println(result);
    }
}
