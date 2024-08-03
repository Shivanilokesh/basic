import java.util.Scanner;

public class numbercheck{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //  user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } else if (number < 10) {
            System.out.println("The number is less than 10.");
        } else {
            System.out.println("The number is equal to 10.");
        }
        
        // Close the scanner
        scanner.close();
    }
}