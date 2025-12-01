// Declare a class Complex with member real and imaginary part

import java.util.Scanner;

class Complex {
    double real;
    double imaginary;
    
    void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        imaginary = sc.nextDouble();
    }
    
    void show() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
    
    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }
}

public class Q3_Complex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        
        System.out.println("Enter first complex number:");
        c1.initialise();
        
        System.out.println("Enter second complex number:");
        c2.initialise();
        
        System.out.print("First complex number: ");
        c1.show();
        
        System.out.print("Second complex number: ");
        c2.show();
        
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.show();
    }
}
