// Write a program to find out the sum of the individual digits of a number.

import java.util.Scanner;

public class Q10_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("Sum of digits of " + original + " = " + sum);
        
        sc.close();
    }
}
