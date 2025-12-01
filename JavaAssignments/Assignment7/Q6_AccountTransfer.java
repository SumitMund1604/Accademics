// Account class with deposit, withdraw and transfer methods

import java.util.Scanner;

class MinimumBalanceException extends Exception {
    MinimumBalanceException(String message) {
        super(message);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;
    static final double MIN_BALANCE = 500;
    
    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + " to account " + acc_no);
        System.out.println("Current Balance: " + balance);
    }
    
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < MIN_BALANCE) {
            throw new MinimumBalanceException("Withdrawal denied! Balance would fall below minimum balance of " + MIN_BALANCE);
        }
        balance -= amt;
        System.out.println("Withdrawn: " + amt + " from account " + acc_no);
        System.out.println("Current Balance: " + balance);
    }
    
    void transfer(Account acc1, Account acc2, double amt) throws MinimumBalanceException {
        if (acc1.balance - amt < MIN_BALANCE) {
            throw new MinimumBalanceException("Transfer denied! Balance in account " + acc1.acc_no + " would fall below minimum balance of " + MIN_BALANCE);
        }
        acc1.balance -= amt;
        acc2.balance += amt;
        System.out.println("Transferred: " + amt + " from account " + acc1.acc_no + " to account " + acc2.acc_no);
        System.out.println("Account " + acc1.acc_no + " balance: " + acc1.balance);
        System.out.println("Account " + acc2.acc_no + " balance: " + acc2.balance);
    }
    
    void displayInfo() {
        System.out.println("Account No: " + acc_no + ", Name: " + name + ", Balance: " + balance);
    }
}

public class Q6_AccountTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Create Account 1:");
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc1 = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double bal1 = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("\nCreate Account 2:");
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc2 = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double bal2 = sc.nextDouble();
        
        Account account1 = new Account(name1, acc1, bal1);
        Account account2 = new Account(name2, acc2, bal2);
        
        System.out.println("\n========== Initial Account Details ==========");
        account1.displayInfo();
        account2.displayInfo();
        
        try {
            System.out.print("\nEnter amount to transfer from Account 1 to Account 2: ");
            double transferAmt = sc.nextDouble();
            account1.transfer(account1, account2, transferAmt);
            
            System.out.println("\n========== After Transfer ==========");
            account1.displayInfo();
            account2.displayInfo();
            
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}
