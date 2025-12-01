// Write a program to check whether an inputted number is positive or negative.

import java.util.Scanner;

public class Q11_PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("Number is zero");
        }
        
        sc.close();
    }
}
