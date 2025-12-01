// Point2D and Point3D inheritance hierarchy

import java.util.Scanner;

class Point2D {
    double x, y;
    
    Point2D() {
        this.x = 0;
        this.y = 0;
    }
    
    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    void display() {
        System.out.println("2D Point: (" + x + ", " + y + ")");
    }
}

class Point3D extends Point2D {
    double z;
    
    Point3D() {
        super();
        this.z = 0;
    }
    
    Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    void show() {
        System.out.println("3D Point: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Q5_Point2D3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coordinates for 2D point:");
        System.out.print("x: ");
        double x2d = sc.nextDouble();
        System.out.print("y: ");
        double y2d = sc.nextDouble();
        
        Point2D point2d = new Point2D(x2d, y2d);
        point2d.display();
        
        System.out.println("\nEnter coordinates for 3D point:");
        System.out.print("x: ");
        double x3d = sc.nextDouble();
        System.out.print("y: ");
        double y3d = sc.nextDouble();
        System.out.print("z: ");
        double z3d = sc.nextDouble();
        
        Point3D point3d = new Point3D(x3d, y3d, z3d);
        point3d.show();
        
        sc.close();
    }
}
