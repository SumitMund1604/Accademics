// Write a program that will take employee id, employee name, department number, salary from the command prompt

public class Q6_CmdLineEmployee {
    
    static void display(String empId, String empName, String deptNo, String salary) {
        System.out.println("========== Employee Record ==========");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Salary: " + salary);
        System.out.println("====================================");
    }
    
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly four arguments");
            System.out.println("Usage: java Q6_CmdLineEmployee <empId> <empName> <deptNo> <salary>");
            return;
        }
        
        String empId = args[0];
        String empName = args[1];
        String deptNo = args[2];
        String salary = args[3];
        
        display(empId, empName, deptNo, salary);
    }
}
