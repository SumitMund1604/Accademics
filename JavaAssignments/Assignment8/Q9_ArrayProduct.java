// Compute product of two 1D arrays using multithreading

import java.util.Scanner;

class OddIndexProduct extends Thread {
    int[] arr1, arr2, result;
    
    OddIndexProduct(int[] arr1, int[] arr2, int[] result) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.result = result;
    }
    
    public void run() {
        for (int i = 1; i < arr1.length; i += 2) {
            result[i] = arr1[i] * arr2[i];
        }
        System.out.println("Odd index multiplication completed");
    }
}

class EvenIndexProduct extends Thread {
    int[] arr1, arr2, result;
    
    EvenIndexProduct(int[] arr1, int[] arr2, int[] result) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.result = result;
    }
    
    public void run() {
        for (int i = 0; i < arr1.length; i += 2) {
            result[i] = arr1[i] * arr2[i];
        }
        System.out.println("Even index multiplication completed");
    }
}

public class Q9_ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arrays: ");
        int size = sc.nextInt();
        
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] result = new int[size];
        
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        
        OddIndexProduct oddThread = new OddIndexProduct(arr1, arr2, result);
        EvenIndexProduct evenThread = new EvenIndexProduct(arr1, arr2, result);
        
        oddThread.start();
        evenThread.start();
        
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nProduct array:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
