// Write a recursive program to find the sum of n natural numbers

import java.util.Scanner;

public class Q12_RecursiveSumNatural {
    
    public static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNatural(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int sum = sumNatural(n);
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
        
        sc.close();
    }
}
