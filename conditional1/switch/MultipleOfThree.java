import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        switch (number % 3) {
            case 0:
                System.out.println(number + " is a multiple of 3.");
                break;
            default:
                System.out.println(number + " is not a multiple of 3.");
                break;
        }

        scanner.close();
    }
}
