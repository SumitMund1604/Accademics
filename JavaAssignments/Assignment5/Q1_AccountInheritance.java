// Account class with inheritance hierarchy

import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    
    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Savings_Account extends Account {
    double min_bal;
    double saving_bal;
    
    Savings_Account(String customerName, int accountNumber, double min_bal, double saving_bal) {
        super(customerName, accountNumber);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    
    void show() {
        display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Savings Balance: " + saving_bal);
    }
}

class Account_details extends Savings_Account {
    double deposit;
    double withdrawal;
    
    Account_details(String customerName, int accountNumber, double min_bal, double saving_bal, double deposit, double withdrawal) {
        super(customerName, accountNumber, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }
    
    void show1() {
        show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
        System.out.println("Final Balance: " + (saving_bal + deposit - withdrawal));
    }
}

public class Q1_AccountInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter minimum balance: ");
        double minBal = sc.nextDouble();
        System.out.print("Enter savings balance: ");
        double savBal = sc.nextDouble();
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double with = sc.nextDouble();
        
        Account_details customer = new Account_details(name, accNo, minBal, savBal, dep, with);
        
        System.out.println("\n========== Customer Account Details ==========");
        customer.show1();
        
        sc.close();
    }
}
