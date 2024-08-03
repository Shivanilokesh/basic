public class numbergenerator {

    //  no parameters and a return value
    public static int generateNumber() {
        return 42; 
    }

    public static void main(String[] args) {
        // Call the generateNumber  and store the result
        int result = generateNumber();

        // Print the result
        System.out.println("The generated number is " + result);
    }
}
