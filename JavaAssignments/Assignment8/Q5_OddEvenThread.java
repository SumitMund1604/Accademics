// Child thread displays odd numbers, main thread displays even numbers

import java.util.Scanner;

class OddNumberPrinter extends Thread {
    int m, n;
    
    OddNumberPrinter(int m, int n) {
        this.m = m;
        this.n = n;
    }
    
    public void run() {
        System.out.println("Odd numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Q5_OddEvenThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        OddNumberPrinter oddThread = new OddNumberPrinter(m, n);
        oddThread.start();
        
        try {
            oddThread.join(); // Wait for odd thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Even numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        sc.close();
    }
}
