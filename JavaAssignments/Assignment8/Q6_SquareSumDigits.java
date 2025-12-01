// Two threads: one for square, one for sum of digits

import java.util.Scanner;

class SquareThread extends Thread {
    int number;
    
    SquareThread(int number) {
        this.number = number;
    }
    
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " = " + square);
    }
}

class SumDigitsThread extends Thread {
    int number;
    
    SumDigitsThread(int number) {
        this.number = number;
    }
    
    public void run() {
        int sum = 0;
        int temp = number;
        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Sum of digits of " + number + " = " + sum);
    }
}

public class Q6_SquareSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        SquareThread t1 = new SquareThread(num);
        SumDigitsThread t2 = new SumDigitsThread(num);
        
        t1.start();
        t2.start();
        
        sc.close();
    }
}
