// Define a class 'Box' that uses a parameterized constructor to initialize dimensions

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
    
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    double getVolume() {
        return this.width * this.height * this.depth;
    }
}

public class Q7_Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        
        System.out.print("Enter depth: ");
        double d = sc.nextDouble();
        
        Box box = new Box(w, h, d);
        double volume = box.getVolume();
        
        System.out.println("Volume of box = " + volume);
        
        sc.close();
    }
}
