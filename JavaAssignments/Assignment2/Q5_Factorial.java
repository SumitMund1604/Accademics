// Write a program to find out the factorial of any inputted number

import java.util.Scanner;

public class Q5_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " = " + factorial);
        }
        
        sc.close();
    }
}
