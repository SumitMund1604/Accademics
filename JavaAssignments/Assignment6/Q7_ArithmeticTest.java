// Test class for btech.arithmetic.MyMath

import btech.arithmetic.MyMath;
import java.util.Scanner;

public class Q7_ArithmeticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("\n========== Arithmetic Operations ==========");
        System.out.println("Addition: " + math.add(num1, num2));
        System.out.println("Subtraction: " + math.subtract(num1, num2));
        System.out.println("Multiplication: " + math.multiply(num1, num2));
        System.out.println("Division: " + math.divide(num1, num2));
        System.out.println("Modulus: " + math.mod(num1, num2));
        
        sc.close();
    }
}
