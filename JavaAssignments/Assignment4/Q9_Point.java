// Design a class 'Point' with data members xCo and yCo

import java.util.Scanner;

class Point {
    double xCo;
    double yCo;
    
    Point(double xCo, double yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }
    
    double distanceBetPoints(Point p) {
        double dx = this.xCo - p.xCo;
        double dy = this.yCo - p.yCo;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Q9_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coordinates of first point:");
        System.out.print("x: ");
        double x1 = sc.nextDouble();
        System.out.print("y: ");
        double y1 = sc.nextDouble();
        
        System.out.println("Enter coordinates of second point:");
        System.out.print("x: ");
        double x2 = sc.nextDouble();
        System.out.print("y: ");
        double y2 = sc.nextDouble();
        
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        double distance = p1.distanceBetPoints(p2);
        System.out.println("Distance between points = " + distance);
        
        sc.close();
    }
}
