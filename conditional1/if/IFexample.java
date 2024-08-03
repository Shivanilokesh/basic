import java.util.Scanner;

public class IFexample{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }
}
