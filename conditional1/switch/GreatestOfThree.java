import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        int greatest = 0;

        switch ((num1 > num2 ? (num1 > num3 ? 1 : 3) : (num2 > num3 ? 2 : 3))) {
            case 1:
                greatest = num1;
                break;
            case 2:
                greatest = num2;
                break;
            case 3:
                greatest = num3;
                break;
        }

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
