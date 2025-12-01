// Person, Employee, HourlyEmployee inheritance hierarchy

import java.util.Scanner;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empid;
    
    Employee(String name, int empid) {
        super(name);
        this.empid = empid;
    }
    
    void display() {
        super.display();
        System.out.println("EmpID: " + empid);
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;
    
    HourlyEmployee(String name, int empid, double hourlyRate, double hoursWorked) {
        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }
    
    void display() {
        super.display();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours worked: " + (int)hoursWorked);
        System.out.println("Gross pay: " + (int)getGrossPay());
    }
}

public class Q7_PersonEmployeeHourly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter employee ID: ");
        int empid = sc.nextInt();
        
        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        
        HourlyEmployee emp = new HourlyEmployee(name, empid, rate, hours);
        
        System.out.println("\n========== Employee Details ==========");
        emp.display();
        
        sc.close();
    }
}
