// Custom exception for x/(x*y) calculation

import java.util.Scanner;

public class Q2_CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter value of x: ");
            double x = sc.nextDouble();
            
            System.out.print("Enter value of y: ");
            double y = sc.nextDouble();
            
            double product = x * y;
            
            if (product == 0) {
                throw new ArithmeticException("Product of x and y is zero. Cannot divide by zero!");
            }
            
            double result = x / product;
            System.out.println("Result: x / (x * y) = " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
        
        sc.close();
    }
}
