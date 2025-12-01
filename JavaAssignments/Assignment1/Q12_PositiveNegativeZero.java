// Write a program to test whether a number is positive, negative or equal to zero.

import java.util.Scanner;

public class Q12_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("Number is equal to zero");
        }
        
        sc.close();
    }
}
