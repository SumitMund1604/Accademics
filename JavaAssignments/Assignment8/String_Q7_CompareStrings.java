// Compare two strings for equality

import java.util.Scanner;

public class String_Q7_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        if (str1.equals(str2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
        
        // Case-insensitive comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal (ignoring case)");
        } else {
            System.out.println("The strings are not equal (ignoring case)");
        }
        
        sc.close();
    }
}
