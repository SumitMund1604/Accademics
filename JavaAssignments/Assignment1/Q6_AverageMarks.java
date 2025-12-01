// Write a program to input the marks of a student in three different subjects and then display the average mark.

import java.util.Scanner;

public class Q6_AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks in subject 1: ");
        float mark1 = sc.nextFloat();
        
        System.out.print("Enter marks in subject 2: ");
        float mark2 = sc.nextFloat();
        
        System.out.print("Enter marks in subject 3: ");
        float mark3 = sc.nextFloat();
        
        float average = (mark1 + mark2 + mark3) / 3;
        System.out.println("Average marks = " + average);
        
        sc.close();
    }
}
