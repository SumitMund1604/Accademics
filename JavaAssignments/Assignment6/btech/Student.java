// Student class in btech package

package btech;

public class Student {
    private String name;
    private int rollNo;
    private double[] marks;
    
    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
    
    public double[] getMarks() {
        return marks;
    }
}
