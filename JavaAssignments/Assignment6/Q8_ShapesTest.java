// Test class for org.shapes package

import org.shapes.*;
import java.util.Scanner;

public class Q8_ShapesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n========== Shape Calculator ==========");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Choose a shape: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.area());
                    System.out.println("Perimeter: " + square.perimeter());
                    break;
                    
                case 2:
                    System.out.print("Enter three sides of triangle: ");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    Triangle triangle = new Triangle(s1, s2, s3);
                    System.out.println("Area: " + triangle.area());
                    System.out.println("Perimeter: " + triangle.perimeter());
                    break;
                    
                case 3:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.area());
                    System.out.println("Perimeter: " + circle.perimeter());
                    break;
                    
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
