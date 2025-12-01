// Write a program to find out the binary equivalent of any inputted decimal number

import java.util.Scanner;

public class Q8_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int original = decimal;
        
        if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
        } else {
            String binary = "";
            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
            System.out.println("Binary equivalent of " + original + " = " + binary);
        }
        
        sc.close();
    }
}
