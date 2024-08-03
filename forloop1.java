 import java.util.Scanner;
public class forloop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("print the even numbers"+num+ ": \n");

        for(int i=0;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
} 
    

