// Compute sum of n natural numbers using multiple threads with synchronization

import java.util.Scanner;

class SumCalculator extends Thread {
    static int globalSum = 0;
    static Object lock = new Object();
    int start, end;
    
    SumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        int localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        
        synchronized (lock) {
            globalSum += localSum;
            System.out.println(Thread.currentThread().getName() + " added " + localSum + " to global sum");
        }
    }
}

public class Q10_SynchronizedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        
        SumCalculator[] threads = new SumCalculator[m];
        int range = n / m;
        int start = 1;
        
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : start + range - 1;
            threads[i] = new SumCalculator(start, end);
            threads[i].start();
            start = end + 1;
        }
        
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("\nSum of first " + n + " natural numbers = " + SumCalculator.globalSum);
        
        sc.close();
    }
}
