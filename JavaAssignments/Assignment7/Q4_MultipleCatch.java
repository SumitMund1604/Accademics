// Multiple catch blocks with a single try block

import java.util.Scanner;

public class Q4_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            
            int result = arr[index] / divisor;
            System.out.println("Result: " + arr[index] + " / " + divisor + " = " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Please enter a valid index within the array size.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
        
        sc.close();
    }
}
