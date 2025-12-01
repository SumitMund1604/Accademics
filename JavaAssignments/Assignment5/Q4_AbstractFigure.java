// Abstract class Figure with getArea() method

import java.util.Scanner;

abstract class Figure {
    double dim1;
    double dim2;
    
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }
    
    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }
    
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

public class Q4_AbstractFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length and breadth of rectangle: ");
        double len = sc.nextDouble();
        double br = sc.nextDouble();
        
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        Figure rect = new Rectangle(len, br);
        Figure tri = new Triangle(base, height);
        
        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Triangle: " + tri.getArea());
        
        sc.close();
    }
}
