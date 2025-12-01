// Convert string to uppercase

import java.util.Scanner;

public class String_Q3_ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        sc.close();
    }
}
