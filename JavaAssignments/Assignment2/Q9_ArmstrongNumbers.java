// Write a program to display all Armstrong numbers from 1 to 10000

public class Q9_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 10000:");
        
        for (int num = 1; num <= 10000; num++) {
            int original = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            
            if (sum == original) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
