// Write a program that will take two integer numbers from the command prompt and find their GCD

public class Q5_CmdLineGCD {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers as arguments");
            System.out.println("Usage: java Q5_CmdLineGCD <num1> <num2>");
            return;
        }
        
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            int result = gcd(num1, num2);
            
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("GCD: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer numbers");
        }
    }
}
