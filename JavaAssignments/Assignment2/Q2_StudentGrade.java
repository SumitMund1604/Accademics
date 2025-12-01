// Write a program to enter the marks of a student in 4 different subjects and display the grade

import java.util.Scanner;

public class Q2_StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks in subject 1: ");
        double mark1 = sc.nextDouble();
        
        System.out.print("Enter marks in subject 2: ");
        double mark2 = sc.nextDouble();
        
        System.out.print("Enter marks in subject 3: ");
        double mark3 = sc.nextDouble();
        
        System.out.print("Enter marks in subject 4: ");
        double mark4 = sc.nextDouble();
        
        double average = (mark1 + mark2 + mark3 + mark4) / 4;
        char grade;
        
        if (average >= 90) {
            grade = 'O';
        } else if (average >= 80) {
            grade = 'E';
        } else if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
