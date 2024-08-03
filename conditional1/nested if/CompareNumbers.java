import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Compare the two numbers using nested if statements
        if (number1 == number2) {
            System.out.println("Both numbers are equal.");
        } else {
            if (number1 > number2) {
                System.out.println("The first number (" + number1 + ") is greater than the second number (" + number2 + ").");
            } else {
                System.out.println("The first number (" + number1 + ") is less than the second number (" + number2 + ").");
            }
        }

        
        scanner.close();
    }
}
