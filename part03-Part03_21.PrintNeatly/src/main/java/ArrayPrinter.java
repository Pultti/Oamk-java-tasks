public class ArrayPrinter {
    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  // Move to the next line after printing all numbers
    }

    public static void main(String[] args) {
        int[] myArray = {5, 1, 3, 4, 2};
        printNeatly(myArray);
    }
}