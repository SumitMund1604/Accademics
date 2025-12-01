// Test class to use btech.Student package

import btech.Student;
import java.util.Scanner;

public class Q6_PackageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        double[] marks = new double[n];
        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextDouble();
        }
        
        Student student = new Student(name, rollNo, marks);
        
        System.out.println("\n========== Student Details ==========");
        student.display();
        
        double total = 0;
        for (double mark : student.getMarks()) {
            total += mark;
        }
        double percentage = (total / (n * 100)) * 100;
        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        sc.close();
    }
}
