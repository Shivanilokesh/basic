import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the num");
            int n=sc.nextInt();
            System.out.println("even numbers upto "+ n +" :\n");
            for(int i=0; i<=n; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    }   
}