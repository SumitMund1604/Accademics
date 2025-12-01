// Design a class 'ComplexNum' to manipulate Complex numbers

import java.util.Scanner;

class ComplexNum {
    double real;
    double img;
    
    ComplexNum(double real, double img) {
        this.real = real;
        this.img = img;
    }
    
    void displayCompNumber() {
        if (img >= 0) {
            System.out.println(real + "+" + img + "i");
        } else {
            System.out.println(real + "" + img + "i");
        }
    }
    
    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
}

public class Q8_ComplexNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();
        
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();
        
        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);
        
        System.out.print("First complex number: ");
        c1.displayCompNumber();
        
        System.out.print("Second complex number: ");
        c2.displayCompNumber();
        
        ComplexNum sum = c1.addCompNumber(c2);
        System.out.print("Sum: ");
        sum.displayCompNumber();
        
        sc.close();
    }
}
