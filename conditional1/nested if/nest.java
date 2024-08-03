
    import java.util.Scanner;

    public class nest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        
        if (score >= 0 && score <= 100) {
           
            if (score >= 90) {
                System.out.println("The grade is A.");
            } else if (score >= 80) {
                System.out.println("The grade is B.");
            } else if (score >= 70) {
                System.out.println("The grade is C.");
            } else if (score >= 60) {
                System.out.println("The grade is D.");
            } else {
                System.out.println("The grade is F.");
            }
        } else {
            
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }
    }
}

       