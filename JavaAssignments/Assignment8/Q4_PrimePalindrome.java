// Main thread checks prime/composite, child thread checks palindrome

import java.util.Scanner;

class PalindromeChecker extends Thread {
    int number;
    
    PalindromeChecker(int number) {
        this.number = number;
    }
    
    public void run() {
        int original = number;
        int reverse = 0;
        int temp = number;
        
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        
        if (original == reverse) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }
}

public class Q4_PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Create and start palindrome checker thread
        PalindromeChecker palindromeThread = new PalindromeChecker(num);
        palindromeThread.start();
        
        // Main thread checks prime/composite
        if (num <= 1) {
            System.out.println(num + " is neither Prime nor Composite");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is Composite");
            }
        }
        
        sc.close();
    }
}
