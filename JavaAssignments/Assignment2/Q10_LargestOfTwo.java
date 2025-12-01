// Write a program to find out the largest between two numbers using a conditional operator

import java.util.Scanner;

public class Q10_LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int largest = (num1 > num2) ? num1 : num2;
        
        System.out.println("Largest number: " + largest);
        
        sc.close();
    }
}
