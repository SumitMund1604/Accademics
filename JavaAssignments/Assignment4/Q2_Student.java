// Write a program to create a class named 'Student' with members 'name', 'roll_no', 'branch'

import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String branch;
    
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }
    
    void displayDetails() {
        System.out.println("\n========== Student Details ==========");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Branch: " + branch);
        System.out.println("====================================");
    }
}

public class Q2_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
    }
}
