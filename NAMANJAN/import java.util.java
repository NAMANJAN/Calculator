import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        // Prompt for operation choice
        System.out.println("Choose operation:  1. Subtraction 2. Addition 3. Multiplication 4. Division");
        int choice = sc.nextInt();

        int result = 0;

        // Perform operation based on user's choice
        switch (choice) {
            case 1: // Subtraction
                result = a - b;
                break;
            case 2: // Addition
                result = a + b;
                break;    
            case 3: // Multiplication
                result = a * b;
                break;
            case 4: // Division
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default: // Invalid choice
                System.out.println("Invalid choice.");
                return;
        }

        // Display result
        System.out.println("Result: " + result);
    }
}