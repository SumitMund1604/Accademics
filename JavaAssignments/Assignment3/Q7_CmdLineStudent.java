// Write a program to accept the SIC, name, branch and marks of six subjects using command line argument. Calculate the average marks.

public class Q7_CmdLineStudent {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Error: Please provide exactly 9 arguments");
            System.out.println("Usage: java Q7_CmdLineStudent <SIC> <name> <branch> <mark1> <mark2> <mark3> <mark4> <mark5> <mark6>");
            return;
        }
        
        try {
            String sic = args[0];
            String name = args[1];
            String branch = args[2];
            
            double totalMarks = 0;
            System.out.println("========== Student Details ==========");
            System.out.println("SIC: " + sic);
            System.out.println("Name: " + name);
            System.out.println("Branch: " + branch);
            System.out.println("Marks in 6 subjects:");
            
            for (int i = 3; i < 9; i++) {
                double mark = Double.parseDouble(args[i]);
                System.out.println("Subject " + (i - 2) + ": " + mark);
                totalMarks += mark;
            }
            
            double average = totalMarks / 6;
            System.out.println("Average Marks: " + average);
            System.out.println("====================================");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid marks");
        }
    }
}
