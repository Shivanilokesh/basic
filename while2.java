 import java.util.Scanner;

public class while2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int maxNumber = scanner.nextInt(); 
        
        int i = 1; 

        
        while (i <= maxNumber) {
            System.out.println(i); 
            i++; 
        }
        
        scanner.close(); 
    }
}
 
    

