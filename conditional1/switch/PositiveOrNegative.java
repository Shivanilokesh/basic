import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        switch (Integer.signum(number)) {
            case 1:
                System.out.println(number + " is a positive number.");
                break;
            case -1:
                System.out.println(number + " is a negative number.");
                break;
            case 0:
                System.out.println(number + " is zero.");
                break;
            default:
                System.out.println("Error! Invalid input.");
                break;
        }

        scanner.close();
    }
}
