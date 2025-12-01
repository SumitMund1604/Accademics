// Write a program to reverse a number.

import java.util.Scanner;

public class Q8_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reverse);
        
        sc.close();
    }
}
