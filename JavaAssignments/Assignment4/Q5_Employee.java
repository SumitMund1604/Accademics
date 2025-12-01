// Write a program to declare a class employee with data members empid, ename, dept, sal

import java.util.Scanner;

class Employee {
    int empid;
    String ename;
    String dept;
    double sal;
    
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        sal = sc.nextDouble();
    }
    
    void putData() {
        System.out.println("EmpID: " + empid + ", Name: " + ename + ", Dept: " + dept + ", Salary: " + sal);
    }
}

public class Q5_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].getData();
        }
        
        System.out.println("\n========== Employee Details ==========");
        for (int i = 0; i < n; i++) {
            employees[i].putData();
        }
        
        sc.close();
    }
}
