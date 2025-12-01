// MyMath class in btech.arithmetic sub-package

package btech.arithmetic;

public class MyMath {
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    
    public double mod(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Modulo by zero");
            return 0;
        }
    }
}
