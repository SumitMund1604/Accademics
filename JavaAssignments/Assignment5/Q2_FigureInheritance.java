// Figure class inheritance with method overriding

import java.util.Scanner;

class Figure {
    double dim1;
    double dim2;
    
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }
    
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }
    
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure {
    Square(double side) {
        super(side, side);
    }
    
    double area() {
        return dim1 * dim1;
    }
}

public class Q2_FigureInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length and breadth of rectangle: ");
        double len = sc.nextDouble();
        double br = sc.nextDouble();
        
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        
        Figure rect = new Rectangle(len, br);
        Figure tri = new Triangle(base, height);
        Figure sq = new Square(side);
        
        System.out.println("\nArea of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Square: " + sq.area());
        
        sc.close();
    }
}
