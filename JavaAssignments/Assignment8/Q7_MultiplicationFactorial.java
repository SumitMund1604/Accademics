// Two threads: one for multiplication table, one for factorial

import java.util.Scanner;

class MultiplicationThread extends Thread {
    int number;
    
    MultiplicationThread(int number) {
        this.number = number;
    }
    
    public void run() {
        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

class FactorialThread extends Thread {
    int number;
    
    FactorialThread(int number) {
        this.number = number;
    }
    
    public void run() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("\nFactorial of " + number + " = " + factorial);
    }
}

public class Q7_MultiplicationFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        MultiplicationThread t1 = new MultiplicationThread(num);
        FactorialThread t2 = new FactorialThread(num);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nBoth threads have completed their tasks.");
        
        sc.close();
    }
}
