public class Square {
    // function with a parameter and no return value
    public static void Square(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }

    public static void main(String[] args) {
        int inputNumber = 5;

       
        Square(inputNumber);
    }
}

