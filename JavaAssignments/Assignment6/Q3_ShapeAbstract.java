// Abstract class Shape with three abstract methods for different shape areas

import java.util.Scanner;

abstract class Shape {
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }
    
    double SquareArea(double side) {
        return side * side;
    }
    
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Q3_ShapeAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();
        
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        
        System.out.println("\nArea of Rectangle: " + area.RectangleArea(length, breadth));
        System.out.println("Area of Square: " + area.SquareArea(side));
        System.out.println("Area of Circle: " + area.CircleArea(radius));
        
        sc.close();
    }
}
