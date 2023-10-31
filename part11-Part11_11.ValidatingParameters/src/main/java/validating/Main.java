package validating;

public class Main {
    public static void main(String[] args) {
        // Luo Calculator-olio
        Calculator calculator = new Calculator();

        // Testaa factorial-metodia
        int factorialResult = calculator.factorial(5);
        System.out.println("5! = " + factorialResult);

        // Testaa binomialCoefficient-metodia
        int binomialResult = calculator.binomialCoefficent(5, 2);
        System.out.println("Binomial coefficient of (5, 2) = " + binomialResult);

        // Voit lisätä myös muita testejä tai käyttää syötteitä käyttäjältä
    }
}