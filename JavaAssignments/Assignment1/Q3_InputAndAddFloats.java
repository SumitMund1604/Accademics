// Write a program to input two floating point numbers through the keyboard and display their sum.

import java.util.Scanner;

public class Q3_InputAndAddFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        
        float sum = num1 + num2;
        System.out.println("Sum = " + sum);
        
        sc.close();
    }
}
