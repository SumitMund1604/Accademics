// Interface Calculator with basic arithmetic operations

import java.util.Scanner;

interface Calculator {
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
}

class DemoCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    
    public double sub(double a, double b) {
        return a - b;
    }
    
    public double mul(double a, double b) {
        return a * b;
    }
    
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

public class Q2_CalculatorInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new DemoCalculator();
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.sub(num1, num2));
        System.out.println("Multiplication: " + calc.mul(num1, num2));
        System.out.println("Division: " + calc.div(num1, num2));
        
        sc.close();
    }
}
