// Exception handling for array index out of bounds

import java.util.Scanner;

public class Q3_ArrayIndexException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            
            System.out.println("Element at index " + index + " is: " + arr[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index position is greater than the size of array!");
            System.out.println("Please enter a valid index.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}
