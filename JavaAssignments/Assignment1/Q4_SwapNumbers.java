// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class Q4_SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        sc.close();
    }
}
