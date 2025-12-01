// Capitalize first letter of each word in a sentence

import java.util.Scanner;

public class String_Q2_CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");
        String result = "";
        
        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        
        System.out.println("Result: " + result.trim());
        
        sc.close();
    }
}
