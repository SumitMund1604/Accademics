// Count total number of characters in a string

import java.util.Scanner;

public class String_Q4_CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int totalChars = str.length();
        System.out.println("Total number of characters: " + totalChars);
        
        sc.close();
    }
}
