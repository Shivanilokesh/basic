
import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is greater than 10
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } 
    
        
    }
}
