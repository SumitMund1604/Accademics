// Define a class Student and display the student with highest CGPA

import java.util.Scanner;

class StudentData {
    int regNo;
    String stdName;
    String branch;
    double CGPA;
    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        CGPA = sc.nextDouble();
    }
    
    void display() {
        System.out.println("RegNo: " + regNo + ", Name: " + stdName + ", Branch: " + branch + ", CGPA: " + CGPA);
    }
}

public class Q6_StudentHighestCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        StudentData[] students = new StudentData[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new StudentData();
            students[i].accept();
        }
        
        // Find highest CGPA
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (students[i].CGPA > students[maxIndex].CGPA) {
                maxIndex = i;
            }
        }
        
        System.out.println("\nStudent with highest CGPA:");
        students[maxIndex].display();
        
        sc.close();
    }
}
