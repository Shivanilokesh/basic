 import java.util.Scanner;

    public class VotingEligibility {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    
            //  enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
    
            // Check the voting eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else if (age > 0 && age < 18) {
                System.out.println("You are not eligible to vote.");
            } else {
                System.out.println("Invalid age entered.");
            }
    
            // Close the scanner
            scanner.close();
        }
    }
    
    

