// Write a program that performs the addition of two numbers using command-line arguments

public class Q4_CmdLineAddition {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers as arguments");
            System.out.println("Usage: java Q4_CmdLineAddition <num1> <num2>");
            return;
        }
        
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer numbers");
        }
    }
}
