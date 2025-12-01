// Convert feet and inches to centimeters with exception handling

import java.util.Scanner;

class InvalidLengthException extends Exception {
    InvalidLengthException(String message) {
        super(message);
    }
}

public class Q7_LengthConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter length in feet: ");
                String feetInput = sc.nextLine();
                double feet = Double.parseDouble(feetInput);
                
                System.out.print("Enter length in inches: ");
                String inchesInput = sc.nextLine();
                double inches = Double.parseDouble(inchesInput);
                
                if (feet < 0 || inches < 0) {
                    throw new InvalidLengthException("Length cannot be negative! Please enter positive values.");
                }
                
                // Convert to centimeters
                // 1 foot = 30.48 cm, 1 inch = 2.54 cm
                double totalCm = (feet * 30.48) + (inches * 2.54);
                
                System.out.println("\n========== Conversion Result ==========");
                System.out.println("Input: " + feet + " feet " + inches + " inches");
                System.out.println("Output: " + totalCm + " centimeters");
                System.out.println("======================================");
                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input! Please enter numeric values only.");
                System.out.println("Please try again.\n");
            } catch (InvalidLengthException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
        
        sc.close();
    }
}
