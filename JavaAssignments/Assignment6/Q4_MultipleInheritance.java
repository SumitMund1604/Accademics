// Multiple inheritance using interfaces

import java.util.Scanner;

interface Father {
    void fatherDetails();
}

interface Mother {
    void motherDetails();
}

class Child implements Father, Mother {
    String fatherName;
    String motherName;
    String childName;
    
    Child(String fatherName, String motherName, String childName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.childName = childName;
    }
    
    public void fatherDetails() {
        System.out.println("Father's Name: " + fatherName);
    }
    
    public void motherDetails() {
        System.out.println("Mother's Name: " + motherName);
    }
    
    void childDetails() {
        System.out.println("Child's Name: " + childName);
    }
}

public class Q4_MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter father's name: ");
        String fName = sc.nextLine();
        
        System.out.print("Enter mother's name: ");
        String mName = sc.nextLine();
        
        System.out.print("Enter child's name: ");
        String cName = sc.nextLine();
        
        Child child = new Child(fName, mName, cName);
        
        System.out.println("\n========== Family Details ==========");
        child.fatherDetails();
        child.motherDetails();
        child.childDetails();
        
        sc.close();
    }
}
