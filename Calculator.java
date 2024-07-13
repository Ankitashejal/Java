import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b =sc.nextInt();

        System.out.println("Choose operation: ");
        int input = sc.nextInt();
        
        switch(input){
            case 1:
            System.out.println("Result: " + (a + b));
            break;
            case 2:
            System.out.println("result: " + (a - b));
            break;

            case 3:
            System.out.println("Result: " + (a * b));
            break;

            case 4:
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero");
            }
            break;
            default: System.out.println("invalid");
        }
        
    }
}