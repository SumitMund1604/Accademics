// Write a program to print the area of a rectangle using 'this' keyword

import java.util.Scanner;

class Area {
    double length;
    double breadth;
    
    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    double getArea() {
        return this.length * this.breadth;
    }
}

public class Q4_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();
        
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        
        rect.setDim(l, b);
        double area = rect.getArea();
        
        System.out.println("Area of rectangle = " + area);
        
        sc.close();
    }
}
