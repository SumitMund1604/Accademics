// Write a program to calculate tax based on income ranges

import java.util.Scanner;

public class Q1_TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0;
        
        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.10;
        } else if (income <= 500000) {
            tax = (150000 * 0.10) + (income - 300000) * 0.20;
        } else {
            tax = (150000 * 0.10) + (200000 * 0.20) + (income - 500000) * 0.30;
        }
        
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
        System.out.println("Net Income: " + (income - tax));
        
        sc.close();
    }
}
