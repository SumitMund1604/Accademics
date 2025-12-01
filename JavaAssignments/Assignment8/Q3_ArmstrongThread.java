// Thread to check Armstrong number

import java.util.Scanner;

class ArmstrongChecker implements Runnable {
    int number;
    
    ArmstrongChecker(int number) {
        this.number = number;
    }
    
    public void run() {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        if (sum == original) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}

public class Q3_ArmstrongThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        ArmstrongChecker checker = new ArmstrongChecker(num);
        Thread thread = new Thread(checker);
        
        thread.start();
        
        sc.close();
    }
}
