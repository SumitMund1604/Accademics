// Write a program to print the average of three numbers entered by user by creating a class named 'Average'

import java.util.Scanner;

class Average {
    void calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of " + num1 + ", " + num2 + ", " + num3 + " = " + average);
    }
}

public class Q1_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average avg = new Average();
        
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        
        avg.calculateAverage(n1, n2, n3);
        
        sc.close();
    }
}
