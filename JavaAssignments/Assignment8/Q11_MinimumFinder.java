// Find minimum element in array using multiple threads with synchronization

import java.util.Scanner;

class MinimumFinder extends Thread {
    static int globalMin = Integer.MAX_VALUE;
    static Object lock = new Object();
    int[] arr;
    int start, end;
    
    MinimumFinder(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        int localMin = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < localMin) {
                localMin = arr[i];
            }
        }
        
        synchronized (lock) {
            if (localMin < globalMin) {
                globalMin = localMin;
            }
            System.out.println(Thread.currentThread().getName() + " found local minimum: " + localMin);
        }
    }
}

public class Q11_MinimumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        
        MinimumFinder[] threads = new MinimumFinder[m];
        int range = n / m;
        int start = 0;
        
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n - 1 : start + range - 1;
            threads[i] = new MinimumFinder(arr, start, end);
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
        
        System.out.println("\nMinimum element in array: " + MinimumFinder.globalMin);
        
        sc.close();
    }
}
