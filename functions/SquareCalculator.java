public class SquareCalculator {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int inputNumber = 4;

        // Call the square function and store the result
        int result = square(inputNumber);

        // Print the result
        System.out.println("The square of " + inputNumber + " is " + result);
    }
}


