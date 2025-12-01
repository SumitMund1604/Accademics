// Exception handling for division by zero

import java.util.Scanner;

public class Q1_DivisionException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter first number (n1): ");
                double n1 = sc.nextDouble();
                
                System.out.print("Enter second number (n2): ");
                double n2 = sc.nextDouble();
                
                if (n2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
                
                double result = n1 / n2;
                System.out.println("Result: " + n1 + " / " + n2 + " = " + result);
                break;
                
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a non-zero value for n2.\n");
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numeric values.\n");
                sc.nextLine(); // Clear buffer
            }
        }
        
        sc.close();
    }
}
